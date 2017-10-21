package com.mcylm.microservice.claymc.service.infomations.controller;

import com.mcylm.microservice.claymc.service.infomations.service.InfoService;
import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_info_po;
import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_po;
import com.mcylm.microservice.claymc.service.servers.service.ServersService;
import com.mcylm.microservice.claymc.service.utils.Result;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/21.
 */
@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @ApiOperation(value="【新增】新增一个MC服务器资料信息，无需登录", notes="新增一个MC服务器资料信息，无需登录")
    @ApiImplicitParam(name = "clay_mc_servers_info_po", value = "服务器资料详细实体clay_mc_servers_info_po", required = true, dataType = "Clay_mc_servers_info_po")
    @RequestMapping(value = "/insertMineCraftServerInfoWithOutLogin",method = RequestMethod.POST)
    public Result insertMineCraftServerInfoWithOutLogin(@RequestBody Clay_mc_servers_info_po clay_mc_servers_info_po){
        return infoService.insertServerInfo(clay_mc_servers_info_po);
    }

    @ApiOperation(value="【修改】修改一个MC服务器信息，无需登录", notes="测试接口详细描述")
    @ApiImplicitParam(name = "clay_mc_servers_info_po", value = "服务器资料详细实体clay_mc_servers_info_po", required = true, dataType = "Clay_mc_servers_info_po")
    @RequestMapping(value = "/updateMineCraftServerInfoWithOutLogin",method = RequestMethod.POST)
    public Result updateMineCraftServerInfoWithOutLogin(@RequestBody Clay_mc_servers_info_po clay_mc_servers_info_po){
        return infoService.updateServerInfo(clay_mc_servers_info_po);
    }

}
