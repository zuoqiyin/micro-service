package cn.zuoqy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zuoqiyin on 10:16 2021/7/17.
 */
@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-zk-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
