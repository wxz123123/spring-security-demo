package com.example.demo.security;

import org.springframework.security.web.context.SecurityContextPersistenceFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/1/24.
 */
public class MySecurityContextPersistenceFilter extends SecurityContextPersistenceFilter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        super.doFilter(req, res, chain);
    }
}
