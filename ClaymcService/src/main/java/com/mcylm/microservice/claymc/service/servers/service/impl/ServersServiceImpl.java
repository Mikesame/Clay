package com.mcylm.microservice.claymc.service.servers.service.impl;

import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_po;
import com.mcylm.microservice.claymc.service.servers.mapper.ServersMapper;
import com.mcylm.microservice.claymc.service.servers.service.ServersService;
import com.mcylm.microservice.claymc.service.utils.DateUtils.DateUtil;
import com.mcylm.microservice.claymc.service.utils.Result;
import com.mcylm.microservice.claymc.service.utils.ResultType;
import com.mcylm.microservice.claymc.service.utils.StringUtil.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/21.
 */
@Service
public class ServersServiceImpl implements ServersService {

    private Result result = new Result();

    @Autowired
    private ServersMapper serversMapper;

    @Override
    public Result insertMineCraftServerByParamsWithOutLogin(Clay_mc_servers_po clay_mc_serversPo) {

        if(clay_mc_serversPo == null){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("参数不存在，请检查参数");
        }

        clay_mc_serversPo.setServer_id(StringUtils.getUUID());
        clay_mc_serversPo.setAdd_time(DateUtil.getStringDate());
        clay_mc_serversPo.setDelflag("1");
        clay_mc_serversPo.setSort_num(5);
        clay_mc_serversPo.setLike_num("0");
        clay_mc_serversPo.setUnlike_num("0");
        clay_mc_serversPo.setServer_rank("0");

        Integer i = serversMapper.insertMcServersByParams(clay_mc_serversPo);

        if(i < 1){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("新增服务器失败");
        }
        result.setCode(ResultType.SUCCESS_CODE);
        result.setIsTrue(true);
        result.setMessage("新增服务器成功");
        result.setData(clay_mc_serversPo.getServer_id());
        return result;
    }

    @Override
    public Result updateMineCraftServerByParamsWithOutLogin(Clay_mc_servers_po clay_mc_serversPo) {

        if(clay_mc_serversPo == null || clay_mc_serversPo.getServer_id() == null || clay_mc_serversPo.getServer_id() == ""){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("服务器ID参数不存在，请检查参数");
        }

        clay_mc_serversPo.setModify_time(DateUtil.getStringDate());

        Integer i = serversMapper.updateMcServersByParams(clay_mc_serversPo);

        if(i < 1){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("修改服务器失败");
        }
        result.setCode(ResultType.SUCCESS_CODE);
        result.setIsTrue(true);
        result.setMessage("修改服务器成功");
        result.setData(clay_mc_serversPo.getServer_id());

        return result;
    }
}
