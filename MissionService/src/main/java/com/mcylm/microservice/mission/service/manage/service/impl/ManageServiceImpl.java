package com.mcylm.microservice.mission.service.manage.service.impl;

import com.mcylm.microservice.mission.service.manage.dao.ManageDao;
import com.mcylm.microservice.mission.service.manage.mapper.ManageMapper;
import com.mcylm.microservice.mission.service.manage.service.ManageService;
import com.mcylm.microservice.mission.service.model.vo.Mission;
import com.mcylm.microservice.mission.service.utils.DateUtils.DateUtil;
import com.mcylm.microservice.mission.service.utils.Result;
import com.mcylm.microservice.mission.service.utils.ResultType;
import com.mcylm.microservice.mission.service.utils.Sender;
import com.mcylm.microservice.mission.service.utils.StringUtil.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ManageServiceImpl implements ManageService {

     private Result result = new Result();

     private String addUser = "fdsf5s6tsdf7sd8gsd6f7sdg7";

    @Autowired
    private ManageMapper manageMapper;

    @Autowired
    private ManageDao manageDao;

    @Override
    public Result addMission(final Mission mission) {
        //判断前台传过来的参数是否为空
        if(mission == null){
            result.setCode(ResultType.FAILD_CODE);
            result.setMessage("参数为空，新增任务失败！");
            result.setIsTrue(false);
            return result;
        }

        //初始化任务
        mission.setAdd_user(addUser);
        mission.setMission_leader(addUser);
        mission.setAdd_time(DateUtil.getStringDate());
        mission.setIs_done("0");
        mission.setIs_locked("0");
        mission.setDelflag("1");
        mission.setMission_id(StringUtils.getUUID());
        mission.setMission_deadline(DateUtil.getStringDateShort()+" "+mission.getMission_deadline());

        Integer i = manageMapper.insertMissionByParams(mission);

        if(i < 1){
            result.setCode(ResultType.FAILD_CODE);
            result.setMessage("新增过程当中出现错误，新增任务失败！");
            result.setIsTrue(false);
            return result;
        }

        Sender sender = new Sender(){{
            setData(mission);
            setMessage("insert a new mission");
            setUuid(StringUtils.getUUID());
            setTopic("mission");
            setTags("mission_insert");
            setType("insert");
        }};

        Result result = manageDao.sendMessage(sender);

        this.result.setCode(ResultType.SUCCESS_CODE);
        this.result.setData(result);
        this.result.setMessage("新增任务成功！");
        this.result.setIsTrue(true);
        return this.result;
    }

    @Override
    public Result updateMission(Mission mission) {
        return null;
    }

    @Override
    public Result finishMission(Mission mission) {
        //判断前台传过来的参数是否为空
        if(mission == null || "".equals(mission.getMission_id())){
            result.setCode(ResultType.FAILD_CODE);
            result.setMessage("参数为空，完成任务失败！");
            result.setIsTrue(false);
            return result;
        }

        //初始化任务
        mission.setModify_user(addUser);
        mission.setModify_time(DateUtil.getStringDate());
        Integer i = manageMapper.updateMissionByParams(mission);

        if(i < 1){
            result.setCode(ResultType.FAILD_CODE);
            result.setMessage("完成过程当中出现错误，完成任务失败！");
            result.setIsTrue(false);
            return result;
        }

        result.setCode(ResultType.SUCCESS_CODE);
        result.setMessage("完成任务成功！");
        result.setIsTrue(true);
        return result;
    }

    @Override
    public Result selectMissionsByParams(Mission mission) {

        List<Map<Object, Object>> maps = manageMapper.selectMissionsByParams(mission);

        if(maps.size() < 1){
            result.setCode(ResultType.SUCCESS_CODE);
            result.setIsTrue(true);
            result.setMessage("查询结果为空");
            result.setTotalNum("0");
            result.setData(maps);
            return result;
        }

        result.setCode(ResultType.SUCCESS_CODE);
        result.setIsTrue(true);
        result.setMessage("查询成功，查询结果有"+maps.size()+"条");
        result.setTotalNum(maps.size()+"");
        result.setData(maps);
        return result;
    }
}
