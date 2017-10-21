package com.mcylm.microservice.claymc.service.infomations.mapper.providers;

import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_info_po;
import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_po;
import com.mcylm.microservice.claymc.service.utils.StringUtil.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2017/10/21.
 */
public class InfoProviders {

    /**
     * 新增clay_mc_servers_info_table表
     * @param clay_mc_servers_info_po
     * @return
     */
    public String insert_Clay_mc_servers_info_Table(final @Param("clay_mc_servers_info_po") Clay_mc_servers_info_po clay_mc_servers_info_po){
        return new SQL() {{
            INSERT_INTO("clay_mc_servers_info");
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_id())){
                VALUES("info_id","#{clay_mc_servers_info_po.info_id}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_title())){
                VALUES("info_title","#{clay_mc_servers_info_po.info_title}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_content())){
                VALUES("info_content","#{clay_mc_servers_info_po.info_content}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_type())){
                VALUES("info_type","#{clay_mc_servers_info_po.info_type}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getServer_id())){
                VALUES("server_id","#{clay_mc_servers_info_po.server_id}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getLike_num())){
                VALUES("like_num","#{clay_mc_servers_info_po.like_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getUnlike_num())){
                VALUES("unlike_num","#{clay_mc_servers_info_po.unlike_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getAdd_user())){
                VALUES("add_user","#{clay_mc_servers_info_po.add_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getAdd_time())){
                VALUES("add_time","#{clay_mc_servers_info_po.add_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getModify_user())){
                VALUES("modify_user","#{clay_mc_servers_info_po.modify_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getModify_time())){
                VALUES("modify_time","#{clay_mc_servers_info_po.modify_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getDelflag())){
                VALUES("delflag","#{clay_mc_servers_info_po.delflag}");
            }

        }}.toString();
    }

    public String update_Clay_mc_servers_info_Table(final @Param("clay_mc_servers_info_po") Clay_mc_servers_info_po clay_mc_servers_info_po){
        return new SQL(){{
            UPDATE("clay_mc_servers_info");
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_title())){
                SET("info_title = #{clay_mc_servers_info_po.info_title}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_content())){
                SET("info_content","#{clay_mc_servers_info_po.info_content}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getInfo_type())){
                SET("info_type = #{clay_mc_servers_info_po.info_type}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getServer_id())){
                SET("server_id = #{clay_mc_servers_info_po.server_id}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getLike_num())){
                SET("like_num = #{clay_mc_servers_info_po.like_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getUnlike_num())){
                SET("unlike_num = #{clay_mc_servers_info_po.unlike_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getAdd_user())){
                SET("add_user = #{clay_mc_servers_info_po.add_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getAdd_time())){
                SET("add_time = #{clay_mc_servers_info_po.add_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getModify_user())){
                SET("modify_user = #{clay_mc_servers_info_po.modify_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getModify_time())){
                SET("modify_time = #{clay_mc_servers_info_po.modify_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_info_po.getDelflag())){
                SET("delflag = #{clay_mc_servers_info_po.delflag}");
            }
            WHERE("info_id = #{clay_mc_servers_info_po.info_id}");
        }}.toString();
    }
}
