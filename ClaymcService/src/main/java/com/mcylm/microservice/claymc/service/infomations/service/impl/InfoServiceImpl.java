package com.mcylm.microservice.claymc.service.infomations.service.impl;

import com.mcylm.microservice.claymc.service.infomations.mapper.InfoMapper;
import com.mcylm.microservice.claymc.service.infomations.service.InfoService;
import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_info_po;
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
public class InfoServiceImpl implements InfoService {

    private Result result = new Result();

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public Result insertServerInfo(Clay_mc_servers_info_po clay_mc_servers_info_po) {
        if(clay_mc_servers_info_po == null){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("参数不存在，请检查参数");
        }

        clay_mc_servers_info_po.setInfo_id(StringUtils.getUUID());
        clay_mc_servers_info_po.setAdd_time(DateUtil.getStringDate());
        clay_mc_servers_info_po.setLike_num("0");
        clay_mc_servers_info_po.setUnlike_num("0");
        clay_mc_servers_info_po.setDelflag("1");

        Integer i = infoMapper.insertInfoByParams(clay_mc_servers_info_po);

        if(i < 1){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("新增服务器资料失败");
        }
        result.setCode(ResultType.SUCCESS_CODE);
        result.setIsTrue(true);
        result.setMessage("新增服务器资料成功");
        result.setData(clay_mc_servers_info_po.getInfo_id());
        return result;
    }

    @Override
    public Result updateServerInfo(Clay_mc_servers_info_po clay_mc_servers_info_po) {
        if(clay_mc_servers_info_po == null || clay_mc_servers_info_po.getInfo_id() == null || clay_mc_servers_info_po.getInfo_id() == ""){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("资料ID参数不存在，请检查参数");
        }

        clay_mc_servers_info_po.setModify_time(DateUtil.getStringDate());

        Integer i = infoMapper.updateInfoByParams(clay_mc_servers_info_po);

        if(i < 1){
            result.setCode(ResultType.FAILD_CODE);
            result.setIsTrue(false);
            result.setMessage("修改服务器资料失败");
        }
        result.setCode(ResultType.SUCCESS_CODE);
        result.setIsTrue(true);
        result.setMessage("修改服务器资料成功");
        result.setData(clay_mc_servers_info_po.getInfo_id());

        return result;
    }
}
