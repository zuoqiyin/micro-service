package cn.zuoqy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付微服务
 *
 * Created by zuoqy on 19:38 2021/4/8.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMent8001Application {

    public static void main(String[] args) {
        SpringApplication.run(PayMent8001Application.class, args);
        System.out.print("payMent8001启动成功");
    }
}