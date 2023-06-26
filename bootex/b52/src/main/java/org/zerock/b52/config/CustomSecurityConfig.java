package org.zerock.b52.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
@EnableMethodSecurity
@RequiredArgsConstructor
public class CustomSecurityConfig {


    private final DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    // 기본 setting
    @Bean
    public SecurityFilterChain filterChain(final HttpSecurity http) throws Exception{

        log.info("*=*=*=*=*=*=*=*configure*=*=*=*=*=*=*=*");

        // 람다식으로 사용
        // http.formLogin(Customizer.withDefaults());

        //모르겠으면 config로 변수써라
        http.formLogin(config -> {
            config.loginPage("/member/signin"); // 로그인 페이지를 이경로로 하겠다.

        });

        



        http.rememberMe(config -> {
            config.tokenRepository(persistentTokenRepository());
            config.tokenValiditySeconds(60*60*24*7);
        });



        // 모든 요청에 대해서 인증값을 확인하라
        // http.authorizeHttpRequests(requests -> {
        //     requests.anyRequest().authenticated();
        // });

        http.csrf(config -> {
            config.disable();
        });

        return http.build();
    }


    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl repo = new JdbcTokenRepositoryImpl();
        repo.setDataSource(dataSource);
        return repo;
    }



    
}
