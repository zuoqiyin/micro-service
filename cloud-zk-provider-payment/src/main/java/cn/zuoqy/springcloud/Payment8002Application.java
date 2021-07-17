package cn.zuoqy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zuoqy on 22:46 2021/7/15.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8002Application {

    public static void main(String args[]) {
        SpringApplication.run(Payment8002Application.class);
        System.out.println("payment8002启动成功。。。");
    }
}
