package cn.zuoqy.springcloud.controller;

import cn.zuoqy.springcloud.entities.CommonResult;
import cn.zuoqy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zuoqy on 22:59 2021/4/19.
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/add")
    public CommonResult add(Payment payment) {
        log.info("插入数据");
        return restTemplate.postForObject("http://localhost:8001/payment/add",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        log.info("查询数据");
        return restTemplate.getForObject("http://localhost:8001/payment/get/"+id,CommonResult.class);
    }

}
