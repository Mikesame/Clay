package com.mcylm.microservice.logger.service.statistic.controller;

import com.mcylm.microservice.logger.service.statistic.feignClient.UserService;
import com.mcylm.microservice.logger.service.utils.Result;
import com.mcylm.microservice.logger.service.utils.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RibbonClient("LoggerService")
public class StatisticController {

    @Autowired
    private UserService userService;

    private static Result result = new Result();

    @RequestMapping("/getMessage")
    public Result getMessage(HttpServletRequest request){
        result.setCode(ResultType.SUCCESS_CODE);
        result.setMessage("running");
        return result;
    }

    @RequestMapping("/getUserInfo")
    public Result getUserInfo(HttpServletRequest request){
        result.setCode(ResultType.SUCCESS_CODE);
        result.setMessage("这里是logger服务器的S2");
        result.setData(userService.getUserInfo());
        return result;
    }


}
