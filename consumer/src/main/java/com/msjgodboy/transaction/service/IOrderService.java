package com.msjgodboy.transaction.service;

import org.mengyun.tcctransaction.api.Compensable;

public interface IOrderService {

    @Compensable
    String updateOrder(String orderId);

}
