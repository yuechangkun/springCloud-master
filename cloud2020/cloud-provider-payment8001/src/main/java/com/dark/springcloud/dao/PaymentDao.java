package com.dark.springcloud.dao;

import com.dark.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：YCK
 * @date ：Created in 2020/10/29 20:50
 * @description：
 * @modified By：
 * @version: 1.0$
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long  id);
}
