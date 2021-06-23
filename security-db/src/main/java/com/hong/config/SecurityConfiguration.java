package com.hong.config;

import com.hong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /**
     * 自定义MyUserDetailsService用来从数据库中根据用户名查询用户信息以及角色信息
     */
    @Autowired
    public UserService userService;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        AuthenticationManager manager = super.authenticationManagerBean();
        return manager;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
    /**
     * 验证配置
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().exceptionHandling()
                .and().requestMatchers().anyRequest()
                .and().authorizeRequests()
                .antMatchers("/actuator/","/token/","/oauth/authorize","/oauth/**").permitAll();
//                .antMatchers("/").authenticated();
        http.authorizeRequests()
                .antMatchers("/**")
                .fullyAuthenticated()
//                .and().userDetailsService(myUserDetailsService)
                .and().httpBasic();  //拦截所有请求 通过httpBasic进行认证
    }
        /**
     * 用户信息校验
     */
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String finalPassword = "{bcrypt}" + bCryptPasswordEncoder.encode("123456");
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager();
        manager.setJdbcTemplate(jdbcTemplate);
        //InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        /*User.UserBuilder builder = User.builder();
        UserDetails user = builder.username("hankin").password(finalPassword).roles("USER").build();
        UserDetails admin = builder.username("admin").password(finalPassword).roles("USER", "ADMIN").build();
        manager.createUser(user);
        manager.createUser(admin);*/
        return manager;
    }
    /**
     *  密码加密
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
