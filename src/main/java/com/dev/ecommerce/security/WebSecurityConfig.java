package com.dev.ecommerce.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity //(debug = true) // when you want to see what filters are applied
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests()
        .antMatchers("/css/**", "/js/**", "/images/**", "/static/**", "/**/favicon.ico").permitAll()
        .antMatchers(HttpMethod.POST, "/login").permitAll()
        .antMatchers("/api/**").permitAll()
        .antMatchers("/").permitAll()
        .anyRequest().authenticated();
  }
}
