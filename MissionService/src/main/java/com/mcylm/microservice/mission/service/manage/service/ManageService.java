package com.mcylm.microservice.mission.service.manage.service;

import com.mcylm.microservice.mission.service.model.vo.Mission;
import com.mcylm.microservice.mission.service.utils.Result;

public interface ManageService {

    Result addMission(Mission mission);

    Result updateMission(Mission mission);

    Result finishMission(Mission mission);

    Result selectMissionsByParams(Mission mission);

}
