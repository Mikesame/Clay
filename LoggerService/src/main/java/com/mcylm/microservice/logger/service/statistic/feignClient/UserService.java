package com.mcylm.microservice.logger.service.statistic.feignClient;

import com.mcylm.microservice.logger.service.utils.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient("UserService")
public interface UserService {

    @RequestMapping(value = "/getUserInfo", method = GET)
    Result getUserInfo();

}
