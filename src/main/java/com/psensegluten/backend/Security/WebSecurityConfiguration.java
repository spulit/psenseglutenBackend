package com.psensegluten.backend.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeRequests()
                .antMatchers("/**").permitAll()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers(HttpMethod.GET,"/psensegluten/*").permitAll()
                .antMatchers(HttpMethod.POST,"/psensegluten/*").permitAll()
                /*.antMatchers(HttpMethod.POST, "/login").permitAll()
                .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
                .antMatchers(HttpMethod.GET,"/master/*").permitAll()
                .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()*/
                .anyRequest().authenticated();
        http.headers().frameOptions().sameOrigin();


    }
}
