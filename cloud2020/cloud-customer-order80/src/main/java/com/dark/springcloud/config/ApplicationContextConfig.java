package com.dark.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：YCK
 * @date ：Created in 2020/11/11 21:28
 * @description：配置类
 * @modified By：
 * @version: 1.0$
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced //开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
