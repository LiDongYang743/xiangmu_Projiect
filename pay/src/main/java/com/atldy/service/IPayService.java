package com.atldy.service;

import java.math.BigDecimal;

/**
 * @author shkstart
 * @create 2020-05-21 18:57
 */
public interface IPayService {

    void create(Integer orderId, BigDecimal amount);

}
