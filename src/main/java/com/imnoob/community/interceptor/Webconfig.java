package com.imnoob.community.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    @Autowired
    private SessionInterceptor sessionInterceptor;



    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**").
                excludePathPatterns("/").
                excludePathPatterns("/index").
                excludePathPatterns("/callback").excludePathPatterns("/css/**").
                excludePathPatterns("/js/**").excludePathPatterns("/images/**").excludePathPatterns("/fonts/**");


    }
}
