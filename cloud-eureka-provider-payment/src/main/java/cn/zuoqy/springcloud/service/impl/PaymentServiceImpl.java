package cn.zuoqy.springcloud.service.impl;

import cn.zuoqy.springcloud.dao.PaymentDao;
import cn.zuoqy.springcloud.entities.Payment;
import cn.zuoqy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zuoqy on 21:34 2021/4/8.
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
