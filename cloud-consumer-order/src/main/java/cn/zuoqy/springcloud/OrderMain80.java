package cn.zuoqy.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zuoqy on 22:52 2021/4/19.
 */
@SpringBootApplication
@Slf4j
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class);
        System.out.print("Order80启动成功!");
    }
}
