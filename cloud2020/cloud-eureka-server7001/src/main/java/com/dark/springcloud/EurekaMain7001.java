package com.dark.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：YCK
 * @date ：Created in 2020/11/14 18:34
 * @description：启动类
 * @modified By：
 * @version: 1.0$
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaMain7001 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaMain7001.class, args);
      }
}
