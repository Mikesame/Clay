package com.mcylm.microservice.claymc.service.servers.mapper.providers;

import com.mcylm.microservice.claymc.service.model.po.Clay_mc_servers_po;
import com.mcylm.microservice.claymc.service.utils.StringUtil.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2017/10/21.
 */
public class ServersProviders {

    /**
     * 新增clay_mc_servers_table表
     * @param clay_mc_servers_po
     * @return
     */
    public String insert_Clay_mc_servers_Table(final @Param("clay_mc_servers_po") Clay_mc_servers_po clay_mc_servers_po){
        return new SQL() {{
            INSERT_INTO("clay_mc_servers");
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_id())){
                VALUES("server_id","#{clay_mc_servers_po.server_id}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_title())){
                VALUES("server_title","#{clay_mc_servers_po.server_title}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_content())){
                VALUES("server_content","#{clay_mc_servers_po.server_content}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_net_type())){
                VALUES("server_net_type","#{clay_mc_servers_po.server_net_type}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_host())){
                VALUES("server_host","#{clay_mc_servers_po.server_host}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_port())){
                VALUES("server_port","#{clay_mc_servers_po.server_port}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_version())){
                VALUES("server_version","#{clay_mc_servers_po.server_version}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_type())){
                VALUES("server_type","#{clay_mc_servers_po.server_type}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getLike_num())){
                VALUES("like_num","#{clay_mc_servers_po.like_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getUnlike_num())){
                VALUES("unlike_num","#{clay_mc_servers_po.unlike_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getOnline_users())){
                VALUES("online_users","#{clay_mc_servers_po.online_users}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_status())){
                VALUES("server_status","#{clay_mc_servers_po.server_status}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_claim())){
                VALUES("server_claim","#{clay_mc_servers_po.server_claim}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_owner())){
                VALUES("server_owner","#{clay_mc_servers_po.server_owner}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getApp_key())){
                VALUES("app_key","#{clay_mc_servers_po.app_key}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getApp_token())){
                VALUES("app_token","#{clay_mc_servers_po.app_token}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_rank())){
                VALUES("server_rank","#{clay_mc_servers_po.server_rank}");
            }
            if(clay_mc_servers_po.getSort_num() != null){
                VALUES("sort_num","#{clay_mc_servers_po.sort_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getAdd_user())){
                VALUES("add_user","#{clay_mc_servers_po.add_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getAdd_time())){
                VALUES("add_time","#{clay_mc_servers_po.add_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getModify_user())){
                VALUES("modify_user","#{clay_mc_servers_po.modify_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getModify_time())){
                VALUES("modify_time","#{clay_mc_servers_po.modify_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getDelflag())){
                VALUES("delflag","#{clay_mc_servers_po.delflag}");
            }

        }}.toString();
    }

    public String update_Clay_mc_servers_Table(final @Param("clay_mc_servers_po") Clay_mc_servers_po clay_mc_servers_po){
        return new SQL(){{
            UPDATE("clay_mc_servers");
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_title())){
                SET("server_title = #{clay_mc_servers_po.server_title}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_content())){
                SET("server_content = #{clay_mc_servers_po.server_content}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_net_type())){
                SET("server_net_type = #{clay_mc_servers_po.server_net_type}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_host())){
                SET("server_host = #{clay_mc_servers_po.server_host}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_port())){
                SET("server_port = #{clay_mc_servers_po.server_port}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_version())){
                SET("server_version = #{clay_mc_servers_po.server_version}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_type())){
                SET("server_type = #{clay_mc_servers_po.server_type}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getLike_num())){
                SET("like_num = #{clay_mc_servers_po.like_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getUnlike_num())){
                SET("unlike_num = #{clay_mc_servers_po.unlike_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getOnline_users())){
                SET("online_users = #{clay_mc_servers_po.online_users}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_status())){
                SET("server_status = #{clay_mc_servers_po.server_status}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_claim())){
                SET("server_claim = #{clay_mc_servers_po.server_claim}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_owner())){
                SET("server_owner = #{clay_mc_servers_po.server_owner}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getApp_key())){
                SET("app_key = #{clay_mc_servers_po.app_key}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getApp_token())){
                SET("app_token = #{clay_mc_servers_po.app_token}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_rank())){
                SET("server_rank = #{clay_mc_servers_po.server_rank}");
            }
            if(clay_mc_servers_po.getSort_num() != null){
                SET("sort_num = #{clay_mc_servers_po.sort_num}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getAdd_user())){
                SET("add_user = #{clay_mc_servers_po.add_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getAdd_time())){
                SET("add_time = #{clay_mc_servers_po.add_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getModify_user())){
                SET("modify_user = #{clay_mc_servers_po.modify_user}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getModify_time())){
                SET("modify_time = #{clay_mc_servers_po.modify_time}");
            }
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getDelflag())){
                SET("delflag = #{clay_mc_servers_po.delflag}");
            }
            WHERE("server_id = #{clay_mc_servers_po.server_id}");
        }}.toString();
    }

    public String select_clay_mc_servers_Table(final @Param("clay_mc_servers_po") Clay_mc_servers_po clay_mc_servers_po){
        return new SQL(){{
            SELECT("cms.server_id","cms.server_no","cms.server_title",
                    "cms.server_content","cb_net_type.code_attribute","cms.server_host",
                    "cms.server_port","cb_version.code_attribute",
                    "CASE WHEN cms.server_type = '0' THEN '纯净服' WHEN '1' THEN '模组服' ELSE '未知服' END server_type",
                    "cms.like_num","cms.unlike_num"
            );
            FROM("clay_mc_servers cms");
            LEFT_OUTER_JOIN("clay_basicdate cb_net_type ON cb_net_type.code_id = cms.server_net_type",
                    "clay_basicdate cb_version ON cb_version.code_id = cms.server_version");
            WHERE("cms.delflag = '1'");
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_title())){
                clay_mc_servers_po.setServer_title("%"+clay_mc_servers_po.getServer_title()+"%");
                WHERE("cms.server_title LIKE #{clay_mc_servers_po.server_title}");
            }
            if(null != clay_mc_servers_po.getServer_no())
                WHERE("cms.server_no = #{clay_mc_servers_po.server_no}");
            if(StringUtils.isNotEmpty(clay_mc_servers_po.getServer_host()))
                WHERE("cms.server_host = #{clay_mc_servers_po.server_host}");
        }}.toString();
    }
}
