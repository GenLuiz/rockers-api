//package com.rockers.api.service.security;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
////import com.rockers.api.UserServiceImpl;
//import javax.annotation.Resource;
//
///**
// * Created by e068806 on 8/28/2017.
// */
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private AuthenticationEntryPoint authenticationEntryPoint;
//
////    @Resource(name = "userDetailService")
////    private UserServiceImpl userService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/user").permitAll()
//                .antMatchers("/swagger-ui.html").permitAll()
//                .antMatchers(HttpMethod.GET, "/v2/api-docs").permitAll()
//                .anyRequest().authenticated()
//                .and().httpBasic()
//                .authenticationEntryPoint(authenticationEntryPoint);
//    }
//
////    @Autowired
////    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//////        auth.inMemoryAuthentication().withUser("john123").password("password").roles("USER");
////        auth.userDetailsService(userService);
////    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("gen123").password("password").roles("USER");
////        auth.userDetailsService(userService);
//    }
//
//}
