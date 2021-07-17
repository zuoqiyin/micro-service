package cn.zuoqy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zuoqiyin on 10:55 2021/7/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8003Application {

    public static void main(String args[]){
        SpringApplication.run(Payment8003Application.class);
        System.out.println("payment8003启动成功...");
    }
}
