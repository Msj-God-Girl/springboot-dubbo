package com.msjgodboy.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.msjgodboy.transaction.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderApi {

    @Reference(interfaceClass = IOrderService.class)
    private IOrderService iOrderService;

    @GetMapping(value = "/updateOrder")
    public Object updateOrder(String orderId) {
        return iOrderService.updateOrder(orderId);
    }

}
