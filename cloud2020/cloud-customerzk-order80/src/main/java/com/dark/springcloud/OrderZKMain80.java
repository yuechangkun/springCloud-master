package com.dark.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：YCK
 * @date ：Created in 2020/11/30 20:02
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZKMain80.class, args);
      }
}
