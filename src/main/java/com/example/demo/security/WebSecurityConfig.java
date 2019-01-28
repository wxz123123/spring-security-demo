package com.example.demo.security;

import com.example.demo.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/1/14.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)// 开启注解权限控制，一定要开启，否则注解权限控制不生效
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService userDetailsService;
    @Autowired
    private MyAccessDeniedHandler accessDeniedHandler;
    @Autowired
    private MyAuthenticationSuccessHandler authenticationSuccessHandler;
    @Autowired
    private MyAuthenticationFailureHandler authenticationFailureHandler;
    @Autowired
    private MyAuthenticationEntryPoint authenticationEntryPoint;

    //处理权限
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                .antMatchers("/login","/register").permitAll()//忽略登录和注册接口，不用认证
                .and()
                .formLogin()//允许表单登录，本例不用表单登录，本例用前后端分离接口登录方式，只提供接口，返回json
                .loginProcessingUrl("/login")
                .successHandler(authenticationSuccessHandler)//登录成功处理
                .failureHandler(authenticationFailureHandler)//登录失败处理
                .permitAll()
                .and()
                .authorizeRequests().anyRequest().authenticated()// 其他所有请求需要身份认证
                .and()
                .exceptionHandling().accessDeniedHandler(accessDeniedHandler)//权限不足处理器
                .and()
                .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint)//用户未登录，请求资源时处理
                ;
    }
    //登录认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(bCryptPasswordEncoder());//设置加密方式
    }
    //配置不拦截规则,放开静态文件
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**/*.js","/**/*.css");
    }

    /**
     * 注入加密方式
     * @return
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
