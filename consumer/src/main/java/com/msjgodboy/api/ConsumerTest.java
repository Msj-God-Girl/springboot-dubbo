package com.msjgodboy.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.msjgodboy.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTest {

    @Reference(interfaceClass = IUserService.class)
    private IUserService iUserService;

    public void getUsername() {
        String username = iUserService.getUsername();
        System.out.println("username:         " + username);
    }

}
