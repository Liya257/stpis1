/*package com.lab.stpis1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers(new AntPathRequestMatcher("/application/post")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/application/put")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/application/one/*")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/application/del/")).permitAll()*/
                 //      .requestMatchers(new AntPathRequestMatcher("**/transport/**")).permitAll()
                   //     .requestMatchers(new AntPathRequestMatcher("/transport/**")).permitAll()
                     //   .requestMatchers(new AntPathRequestMatcher("/company/**")).permitAll()
                      //  .requestMatchers(new AntPathRequestMatcher("/empl/**")).permitAll()
                      //  .requestMatchers(new AntPathRequestMatcher("/client/**")).permitAll()
                      //  .requestMatchers(new AntPathRequestMatcher("/type/**")).permitAll()
                      //  .anyRequest().authenticated())
            //    .httpBasic();
      //  return http.build();
 //   }

//}

