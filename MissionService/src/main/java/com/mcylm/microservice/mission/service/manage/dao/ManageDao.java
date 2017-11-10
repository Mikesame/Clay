package com.mcylm.microservice.mission.service.manage.dao;

import com.mcylm.microservice.mission.service.utils.Result;
import com.mcylm.microservice.mission.service.utils.Sender;

public interface ManageDao {

    Result sendMessage(Sender sender);

}
