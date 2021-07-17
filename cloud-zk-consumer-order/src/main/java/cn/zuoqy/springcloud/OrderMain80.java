package cn.zuoqy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zuoqiyin on 10:12 2021/7/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain80 {

    public static void main(String args[]) {
        SpringApplication.run(OrderMain80.class);
        System.out.println("orderMain80启动成功。。。");
    }
}
