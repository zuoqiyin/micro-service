package cn.zuoqy.springcloud.service;

import cn.zuoqy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zuoqy on 21:34 2021/4/8.
 */

public interface PaymentService {

    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
