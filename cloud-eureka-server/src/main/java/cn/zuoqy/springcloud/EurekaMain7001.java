package cn.zuoqy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka 注册中心
 *
 * Created by zuoqy on 21:09 2021/4/20.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class);
        System.out.println("EurekaMain7001启动成功");
    }
}
