package com.mcylm.microservice.user.service.controller;

import com.mcylm.microservice.user.service.utils.Result;
import com.mcylm.microservice.user.service.utils.ResultType;
import com.mcylm.microservice.user.service.utils.ServiceStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${name}")
    private String name;

    @Value("${author}")
    private String author;

    @Value("${version}")
    private String version;

    private static Result result = new Result();

    @RequestMapping("/getServerStatus")
    public Result getServerStatus(){
        result.setCode(ResultType.SUCCESS_CODE);
        result.setIsTrue(true);
        result.setMessage(ResultType.SUCCESS_MESSAGE);
        result.setData(new ServiceStatus(name,author,version));
        return result;
    }
}
