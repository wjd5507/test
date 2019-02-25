package com.yjkj.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {  
    @Bean
    public FilterRegistrationBean filterRegist() {
        FilterRegistrationBean frBean = new FilterRegistrationBean();  
        frBean.setFilter(new TokenFilter());
        frBean.addUrlPatterns("/*");  
        return frBean;  
    }  
}