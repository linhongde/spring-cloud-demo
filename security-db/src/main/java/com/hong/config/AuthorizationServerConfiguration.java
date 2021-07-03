package com.hong.config;

import com.alibaba.fastjson.JSON;
import com.hong.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

@Configuration
@EnableAuthorizationServer
@Order(6)
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private TokenStore tokenStore;
    @Autowired
    private UserService userService;
    @Autowired
    private ClientDetailsService clientDetailsService;
    static final Logger logger = LoggerFactory.getLogger(AuthorizationServerConfiguration.class);
    // token的保存方式，token是也存储在数据库中
    @Bean
    public TokenStore tokenStore() {
        return new JdbcTokenStore(dataSource);
    }
    /**
     * 客户端配置，客户端信息是存储在表oauth_client_details中的
     */
    @Bean // 声明 ClientDetails实现
    public ClientDetailsService clientDetailsService() {
        return new JdbcClientDetailsService(dataSource);
    }
    /**
     *  用来配置客户端详情服务（ClientDetailsService），
     *  客户端详情信息在这里进行初始化，你能够把客户端详情信息写死在这里或者是通过数据库来存储调取详情信息
     *  1.授权码模式（authorization code）
     *  2.简化模式（implicit）
     *  3.密码模式（resource owner password credentials）
     *  4.客户端模式（client credentials）
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //设置客户端的配置从数据库中读取，存储在oauth_client_details表
        clients.withClientDetails(clientDetailsService);
    }
    /**
     * 用来配置授权（authorization）以及令牌（token）的访问端点和令牌服务(token services)。
     * 1、申明token的存储方式
     * 2、定义了权限校验管理器
     * 3、定义了用户校验service
     * 4、token的属性信息
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // 开启密码验证，来源于 WebSecurityConfigurerAdapter
//        endpoints.authenticationManager(authenticationManager)
//                .userDetailsService(myUserDetailsService); // 读取验证用户的信息
        // 存数据库
        endpoints.tokenStore(tokenStore)
                .authenticationManager(authenticationManager)
                .userDetailsService(userService);
        logger.info("myUserDetailsService=={}", JSON.toJSONString(userService));
        // 配置tokenServices参数
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setTokenStore(endpoints.getTokenStore());
        /* 支持refreshtoken */
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setClientDetailsService(endpoints.getClientDetailsService());
        tokenServices.setTokenEnhancer(endpoints.getTokenEnhancer());
        tokenServices.setAccessTokenValiditySeconds(60 * 10);
        //重复使用
        tokenServices.setReuseRefreshToken(false);
        tokenServices.setRefreshTokenValiditySeconds(60 * 10);
        endpoints.tokenServices(tokenServices);
    }
    /**
     * 配置 token 节点的安全策略
     * AuthorizationServerEndpointsConfigurer：
     * 用来配置授权（authorization）以及令牌（token）的访问端点和令牌服务(token services)。
     * */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        // 允许表单认证
        security.allowFormAuthenticationForClients()
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }
}
