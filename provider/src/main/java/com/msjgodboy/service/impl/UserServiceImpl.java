package com.msjgodboy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.msjgodboy.service.IUserService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {


    @Override
    public String getUsername() {
        return "莫圣急";
    }
}
