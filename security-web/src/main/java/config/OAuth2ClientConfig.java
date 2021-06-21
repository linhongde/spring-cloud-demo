package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

/*@EnableOAuth2Client
@EnableConfigurationProperties
@Configuration*/
public class OAuth2ClientConfig {

        @Bean
        @ConfigurationProperties(prefix = "security.oauth2.client")
        public ClientCredentialsResourceDetails clientCredentialsResourceDetails(){
            return new ClientCredentialsResourceDetails();
        }

        @Bean
        public OAuth2RestTemplate oAuth2RestTemplate(){
            return new OAuth2RestTemplate(clientCredentialsResourceDetails());
        }
}
