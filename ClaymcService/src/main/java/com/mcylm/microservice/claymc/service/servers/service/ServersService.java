package com.mcylm.microservice.claymc.service.servers.service;

import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_po;
import com.mcylm.microservice.claymc.service.utils.Result;

/**
 * Created by Administrator on 2017/10/21.
 */
public interface ServersService {

    /**
     * 新增一个服务器
     * @return
     */
    Result insertMineCraftServerByParamsWithOutLogin(Clay_mc_servers_po clay_mc_serversPo);

    /**
     * 更新一个服务器
     * @param clay_mc_serversPo
     * @return
     */
    Result updateMineCraftServerByParamsWithOutLogin(Clay_mc_servers_po clay_mc_serversPo);

    /**
     * 查询服务器列表
     * @param clay_mc_servers_po
     * @return
     */
    Result selectMineCraftServerByParams(Clay_mc_servers_po clay_mc_servers_po);

    /**
     * 查询 服务器 的详细信息
     * @param clay_mc_servers_po
     * @return
     */
    Result selectMineCraftServerDetailsByParams(Clay_mc_servers_po clay_mc_servers_po);
}
