package com.mcylm.microservice.mission.service.utils;

/**
 * 返回结果实体类型
 *@auther Mikesam
 * date 2017年9月13日
**/
public class Result<T> {
	private String code;
	private String message;
	private String totalNum;
	private boolean isTrue;
	private T data;

	public String getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean getIsTrue() {
		return isTrue;
	}
	public void setIsTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
