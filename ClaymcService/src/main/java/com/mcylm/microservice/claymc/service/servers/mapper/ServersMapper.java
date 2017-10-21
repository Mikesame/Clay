package com.mcylm.microservice.claymc.service.servers.mapper;

import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_po;
import com.mcylm.microservice.claymc.service.servers.mapper.providers.ServersProviders;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Created by Administrator on 2017/10/21.
 */
@Mapper
public interface ServersMapper {

    /**
     * 新增一个Mc服务器记录
     * @param clay_mc_servers_po
     * @return
     */
    @InsertProvider(type = ServersProviders.class,method = "insert_Clay_mc_servers_Table")
    Integer insertMcServersByParams(@Param("clay_mc_servers_po") Clay_mc_servers_po clay_mc_servers_po);

    /**
     * 更新一个Mc服务器记录
     * @param clay_mc_servers_po
     * @return
     */
    @UpdateProvider(type = ServersProviders.class,method = "update_Clay_mc_servers_Table")
    Integer updateMcServersByParams(@Param("clay_mc_servers_po") Clay_mc_servers_po clay_mc_servers_po);
}
