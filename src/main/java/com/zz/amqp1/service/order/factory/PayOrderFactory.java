package com.zz.amqp1.service.order.factory;

import com.zz.amqp1.service.order.IOrder;
import com.zz.amqp1.service.order.PayOrder;

/**
 * Description:
 * User: zhouzhou
 * Date: 2019-04-07
 * Time: 9:15 PM
 */
public class PayOrderFactory extends AbstractOrderFactory {
    @Override
    public IOrder createOrder() {
        preHandle();
        return new PayOrder();
    }
}
