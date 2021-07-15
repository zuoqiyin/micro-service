package cn.zuoqy.springcloud.controller;

import cn.zuoqy.springcloud.entities.CommonResult;
import cn.zuoqy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zuoqy on 22:59 2021/4/19.
 */
@RestController
@Slf4j
public class OrderController {

    static final String PAYMENT_UTL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/add")
    public CommonResult add(@RequestBody Payment payment) {
        log.info("插入数据");
        return restTemplate.postForObject(PAYMENT_UTL +"/payment/add",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        log.info("查询数据");
        return restTemplate.getForObject(PAYMENT_UTL + "/payment/get/"+id,CommonResult.class);
    }

}
