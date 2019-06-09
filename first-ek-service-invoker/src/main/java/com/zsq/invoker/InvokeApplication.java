package com.zsq.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 调用者
 * @author zsq
 * @date 2019/6/9 - 22:12
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class InvokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvokeApplication.class, args);
    }

}
