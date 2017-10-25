package com.mcylm.microservice.mission.service.manage.mapper;

import com.mcylm.microservice.mission.service.manage.mapper.mapperProvider.ManageProviders;
import com.mcylm.microservice.mission.service.model.vo.Mission;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ManageMapper {

    @InsertProvider(type = ManageProviders.class, method = "insertMission")
    Integer insertMissionByParams(@Param("mission") Mission mission);

    @UpdateProvider(type = ManageProviders.class, method = "updateMission")
    Integer updateMissionByParams(@Param("mission") Mission mission);

    @SelectProvider(type = ManageProviders.class, method = "selectMission")
    Mission selectMissionById(@Param("mission") Mission mission);

    @SelectProvider(type = ManageProviders.class, method = "selectMissionsByParams")
    List<Map<Object,Object>> selectMissionsByParams(@Param("mission") Mission mission);

}
