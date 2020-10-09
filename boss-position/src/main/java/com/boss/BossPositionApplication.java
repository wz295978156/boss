package com.boss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//eureka客户端
@EnableDiscoveryClient
//熔断降级
@EnableHystrix
//feign远程调用
@EnableFeignClients
public class BossPositionApplication {
    public static void main(String[] args) {
        SpringApplication.run(BossPositionApplication.class);
    }
}
