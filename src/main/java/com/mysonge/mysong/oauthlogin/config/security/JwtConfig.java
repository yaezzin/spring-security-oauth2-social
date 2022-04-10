package com.mysonge.mysong.oauthlogin.config.security;

import com.mysonge.mysong.oauthlogin.oauth.token.AuthTokenProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    // Jwt를 사용하기 위한 설정
    @Value("${jwt.secret}")
    private String secret;

    @Bean
    public AuthTokenProvider jwtProvied() {
        return new AuthTokenProvider(secret);
    }
}
