package com.ikun.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {//添加跨域映射关系
        //设置允许跨域的规则
        registry.addMapping("/**")
                .allowedOriginPatterns("*")                             //设置允许跨域的域名
                .allowCredentials(true)                                 //是否运行cookie
                .allowedMethods("GET","POST","PUT","DELETE")            //设置运行请求方式
                .allowedHeaders("*")                                    //设置运行的头部信息
                .maxAge(3600);                                          //设置跨域的时间 单位秒


    }
}
