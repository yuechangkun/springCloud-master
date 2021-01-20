package com.dark.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：YCK
 * @date ：Created in 2020/12/5 10:05
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myrule(){
        return new RandomRule(); //负载均衡规则定义为随机
    }


}
