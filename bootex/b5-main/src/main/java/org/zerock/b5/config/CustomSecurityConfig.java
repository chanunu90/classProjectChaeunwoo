package org.zerock.b5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
@EnableMethodSecurity
public class CustomSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // 기본 setting
    @Bean
    public SecurityFilterChain filterChain(final HttpSecurity http) throws Exception{

        log.info("*=*=*=*=*=*=*=*configure*=*=*=*=*=*=*=*");

        // 람다식으로 사용
        http.formLogin(Customizer.withDefaults());

        // 모든 요청에 대해서 인증값을 확인하라
        // http.authorizeHttpRequests(requests -> {
        //     requests.anyRequest().authenticated();
        // });

        return http.build();
    }
    //////// end setting
}
