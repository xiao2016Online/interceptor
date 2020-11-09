package com.xiaopy.interceptor.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author xiaopeiyu
 * @since 2020/11/9
 */

@WebFilter(urlPatterns = "/*",filterName = "MineFilter")
@Slf4j
@Order(1)
public class MineFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(">>>>>>mineFilter init >>>>>");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info(">>>>>>mineFilter doFilter >>>>>");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info(">>>>>>mineFilter destroy >>>>>");
    }
}
