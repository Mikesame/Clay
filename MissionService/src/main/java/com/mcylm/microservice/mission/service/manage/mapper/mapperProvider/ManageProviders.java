package com.mcylm.microservice.mission.service.manage.mapper.mapperProvider;

import com.mcylm.microservice.mission.service.model.vo.Mission;
import com.mcylm.microservice.mission.service.utils.StringUtil.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class ManageProviders {

    public String insertMission(final @Param("mission") Mission mission){
        return new SQL(){{
            INSERT_INTO("clay_mission");
            if(StringUtils.isNotEmpty(mission.getMission_id()))
                VALUES("mission_id","#{mission_id}");
            if(StringUtils.isNotEmpty(mission.getMission_title()))
                VALUES("mission_title","#{mission_title}");
            if(StringUtils.isNotEmpty(mission.getMission_content()))
                VALUES("mission_leader","#{mission_leader}");
            if(StringUtils.isNotEmpty(mission.getMission_deadline()))
                VALUES("mission_deadline","#{mission_deadline}");
            if(StringUtils.isNotEmpty(mission.getMission_priorty()))
                VALUES("mission_priority","#{mission_priority}");
            if(StringUtils.isNotEmpty(mission.getMission_remind()))
                VALUES("mission_remind","#{mission_remind}");
            if(StringUtils.isNotEmpty(mission.getMission_filename()))
                VALUES("mission_filename","#{mission_filename}");
            if(StringUtils.isNotEmpty(mission.getMission_filepath()))
                VALUES("mission_filepath","#{mission_filepath}");
            if(StringUtils.isNotEmpty(mission.getIs_done()))
                VALUES("is_done","#{is_done}");
            if(StringUtils.isNotEmpty(mission.getIs_partner_visible()))
                VALUES("is_partner_visible","#{is_partner_visible}");
            if(StringUtils.isNotEmpty(mission.getIs_locked()))
                VALUES("is_locked","#{is_locked}");
            if(StringUtils.isNotEmpty(mission.getIs_private()))
                VALUES("is_private","#{is_private}");
            if(StringUtils.isNotEmpty(mission.getAdd_user()))
                VALUES("add_user","#{add_user}");
            if(StringUtils.isNotEmpty(mission.getAdd_time()))
                VALUES("add_time","#{add_time}");
            if(StringUtils.isNotEmpty(mission.getModify_user()))
                VALUES("modify_user","#{modify_user}");
            if(StringUtils.isNotEmpty(mission.getModify_time()))
                VALUES("modify_time","#{modify_time}");
            if(StringUtils.isNotEmpty(mission.getDelflag()))
                VALUES("delflag","#{delflag}");
        }}.toString();
    }

    public String updateMission(final @Param("mission") Mission mission){
        return new SQL(){{
            UPDATE("clay_mission");
            if(StringUtils.isNotEmpty(mission.getMission_title()))
                SET("mission_title = #{mission_title}");
            if(StringUtils.isNotEmpty(mission.getMission_content()))
                SET("mission_leader = #{mission_leader}");
            if(StringUtils.isNotEmpty(mission.getMission_deadline()))
                SET("mission_deadline = #{mission_deadline}");
            if(StringUtils.isNotEmpty(mission.getMission_priorty()))
                SET("mission_priority = #{mission_priority}");
            if(StringUtils.isNotEmpty(mission.getMission_remind()))
                SET("mission_remind = #{mission_remind}");
            if(StringUtils.isNotEmpty(mission.getMission_filename()))
                SET("mission_filename = #{mission_filename}");
            if(StringUtils.isNotEmpty(mission.getMission_filepath()))
                SET("mission_filepath = #{mission_filepath}");
            if(StringUtils.isNotEmpty(mission.getIs_done()))
                SET("is_done = #{is_done}");
            if(StringUtils.isNotEmpty(mission.getIs_partner_visible()))
                SET("is_partner_visible = #{is_partner_visible}");
            if(StringUtils.isNotEmpty(mission.getIs_locked()))
                SET("is_locked = #{is_locked}");
            if(StringUtils.isNotEmpty(mission.getIs_private()))
                SET("is_private = #{is_private}");
            if(StringUtils.isNotEmpty(mission.getAdd_user()))
                SET("add_user = #{add_user}");
            if(StringUtils.isNotEmpty(mission.getAdd_time()))
                SET("add_time = #{add_time}");
            if(StringUtils.isNotEmpty(mission.getModify_user()))
                SET("modify_user = #{modify_user}");
            if(StringUtils.isNotEmpty(mission.getModify_time()))
                SET("modify_time = #{modify_time}");
            if(StringUtils.isNotEmpty(mission.getDelflag()))
                SET("delflag = #{delflag}");
            if(StringUtils.isNotEmpty(mission.getMission_id()))
                SET("mission_id = #{mission_id}");
        }}.toString();
    }

    public String selectMission(final @Param("mission") Mission mission){
        return  new SQL(){{
            SELECT("mission_id","mission_title","mission_content","mission_leader","mission_deadline",
                    "mission_priority","mission_remind","mission_filename","mission_filepath","is_done",
                    "is_partner_visible","is_locked","is_private","add_user","add_time","modify_time","modify_user");
            FROM("clay_mission");
            WHERE("delflag = '1'","mission_id = #{mission_id}");
        }}.toString();
    }

    public String selectMissionsByParams(final @Param("mission") Mission mission){
        return new SQL(){{
            SELECT("cm.mission_id","cm.mission_title","cm.mission_content","cm.mission_leader",
                    "cui_mission_leader.user_info_name mission_leader_name","cm.mission_deadline",
                    "cm.mission_priority","cm.mission_remind","cm.mission_filename","cm.mission_filepath","cm.is_done",
                    "cm.is_partner_visible","cm.is_locked","cm.is_private","cm.add_time","cm.modify_time");
            FROM("clay_mission cm");
            LEFT_OUTER_JOIN("clay_user_info cui_mission_leader on cui.user_id = cm.mission_leader");
            WHERE("cm.delflag = '1'","cm.is_done = '0'");

//            if(mission.get)

            //根据任务的deadline和优先级以及新增时间排序
            ORDER_BY("cm.mission_deadline asc","cm.mission_priority","cm.add_time desc");
        }}.toString();
    }


}
