package com.dark.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：YCK
 * @date ：Created in 2020/12/2 16:42
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8006.class, args);
      }
}
