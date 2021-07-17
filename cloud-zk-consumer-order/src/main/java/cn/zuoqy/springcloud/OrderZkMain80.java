package cn.zuoqy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zuoqiyin on 10:12 2021/7/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {

    public static void main(String args[]) {
        SpringApplication.run(OrderZkMain80.class);
        System.out.println("orderZkMain80启动成功。。。");
    }
}
