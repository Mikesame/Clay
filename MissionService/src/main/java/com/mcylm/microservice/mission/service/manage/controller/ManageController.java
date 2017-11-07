package com.mcylm.microservice.mission.service.manage.controller;

import com.mcylm.microservice.mission.service.manage.service.ManageService;
import com.mcylm.microservice.mission.service.model.vo.Mission;
import com.mcylm.microservice.mission.service.utils.Result;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageController {

    @Autowired
    private ManageService manageService;

    @ApiOperation(value="【新增】新增一个任务", notes="新增一个任务")
    @ApiImplicitParam(name = "mission", value = "任务实体类Mission", required = true, dataType = "Mission")
    @RequestMapping(value = "/insertMission",method = RequestMethod.POST)
    public Result insertMission(@RequestBody Mission mission){
        return manageService.addMission(mission);
    }

    @ApiOperation(value="【查询】查询所有的任务", notes="查询所有的任务")
    @ApiImplicitParam(name = "mission", value = "任务实体类Mission", required = true, dataType = "Mission")
    @RequestMapping(value = "/selectMissions",method = RequestMethod.POST)
    public Result selectMissions(@RequestBody Mission mission){
        return manageService.selectMissionsByParams(mission);
    }

    @ApiOperation(value="【修改】完成任务", notes="完成任务")
    @ApiImplicitParam(name = "mission", value = "任务实体类Mission", required = true, dataType = "Mission")
    @RequestMapping(value = "/finishMission",method = RequestMethod.POST)
    public Result finishMission(@RequestBody Mission mission){
        return manageService.finishMission(mission);
    }

}
