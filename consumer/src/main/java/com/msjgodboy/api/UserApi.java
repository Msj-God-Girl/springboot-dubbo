package com.msjgodboy.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.msjgodboy.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserApi {

    @Reference(interfaceClass = IUserService.class)
    private IUserService iUserService;

    @GetMapping("/getUsername")
    public Object getUsername() {
        return iUserService.getUsername();
    }

}
