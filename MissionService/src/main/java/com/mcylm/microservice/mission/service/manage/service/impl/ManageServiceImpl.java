package com.mcylm.microservice.mission.service.manage.service.impl;

import com.mcylm.microservice.mission.service.manage.mapper.ManageMapper;
import com.mcylm.microservice.mission.service.manage.service.ManageService;
import com.mcylm.microservice.mission.service.model.vo.Mission;
import com.mcylm.microservice.mission.service.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    @Override
    public Result addMission(Mission mission) {
        return null;
    }

    @Override
    public Result updateMission(Mission mission) {
        return null;
    }

    @Override
    public Result deleteMission(Mission mission) {
        return null;
    }
}
