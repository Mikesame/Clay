package com.mcylm.microservice.claymc.service.servers.controller;

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
@RequestMapping("/server")
public class ServersController {

    @Autowired
    private ServersService serversService;

    @ApiOperation(value="【新增】新增一个MC服务器信息，无需登录", notes="新增一个MC服务器信息，无需登录")
    @ApiImplicitParam(name = "clay_mc_serversPo", value = "服务器详细实体clay_mc_servers", required = true, dataType = "Clay_mc_servers_po")
    @RequestMapping(value = "/insertMineCraftServerWithOutLogin",method = RequestMethod.POST)
    public Result insertMineCraftServerWithOutLogin(@RequestBody Clay_mc_servers_po clay_mc_serversPo){
        return serversService.insertMineCraftServerByParamsWithOutLogin(clay_mc_serversPo);
    }

    @ApiOperation(value="【修改】修改一个MC服务器信息，无需登录", notes="测试接口详细描述")
    @ApiImplicitParam(name = "clay_mc_serversPo", value = "服务器详细实体clay_mc_servers", required = true, dataType = "Clay_mc_servers_po")
    @RequestMapping(value = "/updateMineCraftServerWithOutLogin",method = RequestMethod.POST)
    public Result updateMineCraftServerWithOutLogin(@RequestBody Clay_mc_servers_po clay_mc_serversPo){
        return serversService.updateMineCraftServerByParamsWithOutLogin(clay_mc_serversPo);
    }

    @ApiOperation(value="【查询】查询一个MC服务器信息，无需登录", notes="测试接口详细描述")
    @ApiImplicitParam(name = "clay_mc_serversPo", value = "服务器详细实体clay_mc_servers", required = true, dataType = "Clay_mc_servers_po")
    @RequestMapping(value = "/selectMineCraftServers",method = {RequestMethod.GET,RequestMethod.POST})
    public Result selectMineCraftServers(@RequestBody Clay_mc_servers_po clay_mc_serversPo){
        return serversService.selectMineCraftServerByParams(clay_mc_serversPo);
    }

}
