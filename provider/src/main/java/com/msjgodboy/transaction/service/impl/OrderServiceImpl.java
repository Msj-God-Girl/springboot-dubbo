package com.msjgodboy.transaction.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.msjgodboy.transaction.service.IOrderService;
import org.mengyun.tcctransaction.api.Compensable;
import org.mengyun.tcctransaction.dubbo.context.DubboTransactionContextEditor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Service(interfaceClass = IOrderService.class)
public class OrderServiceImpl implements IOrderService {


    @Override
    @Compensable(confirmMethod = "confirmUpdateOrder", cancelMethod = "cancelUpdateOrder", transactionContextEditor = DubboTransactionContextEditor.class)
    public String updateOrder(String orderId) {
        System.out.println("orderId is : " + orderId);
        if(StringUtils.isEmpty(orderId)){
            throw new NullPointerException();
        }
        return "update success : " + orderId;
    }

    public String confirmUpdateOrder(String orderId) {
        System.out.println("this is confirmUpdateOrder orderId="+orderId);
        return "confirmUpdateOrder="+orderId;
    }

    public String cancelUpdateOrder(String orderId) {
        System.out.println("this is cancelUpdateOrder orderId=" + orderId);
        return "cancelUpdateOrder=" + orderId;
    }
}
