package cn.zuoqy.springcloud.dao;

import cn.zuoqy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zuoqy on 19:59 2021/4/8.
 */
@Mapper
public interface PaymentDao {

    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
