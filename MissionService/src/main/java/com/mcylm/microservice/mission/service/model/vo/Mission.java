package com.mcylm.microservice.mission.service.model.vo;

import java.io.Serializable;

public class Mission implements Serializable {

    private String mission_id;
    private String mission_title;
    private String mission_content;
    private String mission_leader;
    private String mission_deadline;
    private String mission_priorty; //优先级
    private String mission_remind;
    private String mission_filename;
    private String mission_filepath;
    private String is_done;
    private String is_partner_visible;
    private String is_locked;
    private String is_private;
    private String add_user;
    private String add_time;
    private String modify_time;
    private String modify_user;
    private String delflag;

    public String getMission_id() {
        return mission_id;
    }

    public void setMission_id(String mission_id) {
        this.mission_id = mission_id;
    }

    public String getMission_title() {
        return mission_title;
    }

    public void setMission_title(String mission_title) {
        this.mission_title = mission_title;
    }

    public String getMission_content() {
        return mission_content;
    }

    public void setMission_content(String mission_content) {
        this.mission_content = mission_content;
    }

    public String getMission_leader() {
        return mission_leader;
    }

    public void setMission_leader(String mission_leader) {
        this.mission_leader = mission_leader;
    }

    public String getMission_deadline() {
        return mission_deadline;
    }

    public void setMission_deadline(String mission_deadline) {
        this.mission_deadline = mission_deadline;
    }

    public String getMission_priorty() {
        return mission_priorty;
    }

    public void setMission_priorty(String mission_priorty) {
        this.mission_priorty = mission_priorty;
    }

    public String getMission_remind() {
        return mission_remind;
    }

    public void setMission_remind(String mission_remind) {
        this.mission_remind = mission_remind;
    }

    public String getMission_filename() {
        return mission_filename;
    }

    public void setMission_filename(String mission_filename) {
        this.mission_filename = mission_filename;
    }

    public String getMission_filepath() {
        return mission_filepath;
    }

    public void setMission_filepath(String mission_filepath) {
        this.mission_filepath = mission_filepath;
    }

    public String getIs_done() {
        return is_done;
    }

    public void setIs_done(String is_done) {
        this.is_done = is_done;
    }

    public String getIs_partner_visible() {
        return is_partner_visible;
    }

    public void setIs_partner_visible(String is_partner_visible) {
        this.is_partner_visible = is_partner_visible;
    }

    public String getIs_locked() {
        return is_locked;
    }

    public void setIs_locked(String is_locked) {
        this.is_locked = is_locked;
    }

    public String getIs_private() {
        return is_private;
    }

    public void setIs_private(String is_private) {
        this.is_private = is_private;
    }

    public String getAdd_user() {
        return add_user;
    }

    public void setAdd_user(String add_user) {
        this.add_user = add_user;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }
}
