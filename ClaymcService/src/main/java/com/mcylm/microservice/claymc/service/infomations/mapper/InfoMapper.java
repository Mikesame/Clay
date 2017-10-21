package com.mcylm.microservice.claymc.service.infomations.mapper;

import com.mcylm.microservice.claymc.service.infomations.mapper.providers.InfoProviders;
import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_info_po;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Created by Administrator on 2017/10/21.
 */
@Mapper
public interface InfoMapper {

    @InsertProvider(type = InfoProviders.class,method = "insert_Clay_mc_servers_info_Table")
    Integer insertInfoByParams(@Param("clay_mc_servers_info_po")Clay_mc_servers_info_po clay_mc_servers_info_po);

    @UpdateProvider(type = InfoProviders.class,method = "update_Clay_mc_servers_info_Table")
    Integer updateInfoByParams(@Param("clay_mc_servers_info_po")Clay_mc_servers_info_po clay_mc_servers_info_po);
}
