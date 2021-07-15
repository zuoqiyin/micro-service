package cn.zuoqy.springcloud.controller;

import cn.zuoqy.springcloud.entities.CommonResult;
import cn.zuoqy.springcloud.entities.Payment;
import cn.zuoqy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zuoqy on 21:37 2021/4/8.
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("插入结果:"+result);
        if (result>0) {
            return new CommonResult<>(0,serverPort+"-插入成功",result);
        } else {
            return new CommonResult<>(1,serverPort+"-插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果:"+payment);

        if (payment!=null) {
            return new CommonResult<Payment>(0,serverPort+"-查询成功",payment);
        } else {
            return new CommonResult<>(1,serverPort+"-没有对应记录:"+id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String item: services) {
            log.info("******item:"+item);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance: instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
