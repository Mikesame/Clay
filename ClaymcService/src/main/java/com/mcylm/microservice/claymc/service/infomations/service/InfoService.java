package com.mcylm.microservice.claymc.service.infomations.service;

import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_info_po;
import com.mcylm.microservice.claymc.service.utils.Result;

/**
 * Created by Administrator on 2017/10/21.
 */
public interface InfoService {

    Result insertServerInfo(Clay_mc_servers_info_po clay_mc_servers_info_po);

    Result updateServerInfo(Clay_mc_servers_info_po clay_mc_servers_info_po);

}
