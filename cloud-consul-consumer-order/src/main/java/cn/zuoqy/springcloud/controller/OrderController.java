package cn.zuoqy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zuoqiyin on 11:11 2021/7/17.
 */
@RestController
@Slf4j
public class OrderController {

    private final static String INVOKE_URL = "http://cloud-consul-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
    }
}
