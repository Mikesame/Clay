package com.mcylm.microservice.user.service.infomation.controller;

import com.mcylm.microservice.user.service.model.vo.UserInfo;
import com.mcylm.microservice.user.service.utils.Result;
import com.mcylm.microservice.user.service.utils.ResultType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private static Result result = new Result();

    @RequestMapping("/getUserInfo")
    public Result getUserInfo(){
        result.setCode(ResultType.SUCCESS_CODE);
        result.setMessage("用户资料信息,获取自S2服务器");
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("Mikesam");
        userInfo.setPassword("123456");
        result.setData(userInfo);
        return result;
    }
}
