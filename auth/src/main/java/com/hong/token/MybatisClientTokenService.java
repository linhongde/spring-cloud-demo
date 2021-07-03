package com.hong.token;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.ClientTokenServices;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

/**
 * 将token信息存储在数据库中
 */
public class MybatisClientTokenService implements ClientTokenServices {

    /**
     * 获取token信息
     * @param oAuth2ProtectedResourceDetails
     * @param authentication
     * @return
     */
    @Override
    public OAuth2AccessToken getAccessToken(OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails, Authentication authentication) {
        return null;
    }

    /**
     * 保存token信息
     * @param oAuth2ProtectedResourceDetails
     * @param authentication
     * @param oAuth2AccessToken
     */
    @Override
    public void saveAccessToken(OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails, Authentication authentication, OAuth2AccessToken oAuth2AccessToken) {

    }

    /**
     * 删除token信息
     * @param oAuth2ProtectedResourceDetails
     * @param authentication
     */
    @Override
    public void removeAccessToken(OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails, Authentication authentication) {

    }
}
