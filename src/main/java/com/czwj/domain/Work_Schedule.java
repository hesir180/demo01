package com.czwj.domain;

public class Work_Schedule {
	private int id;
	private String workScheduleCode;
	private String workScheduleName;
	private String workStartTime;
	private String workEndTime;
	private String teamId;
	private String teamName;
	private String remark;
	private String modifyDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWorkScheduleCode() {
		return workScheduleCode;
	}
	public void setWorkScheduleCode(String workScheduleCode) {
		this.workScheduleCode = workScheduleCode;
	}
	public String getWorkScheduleName() {
		return workScheduleName;
	}
	public void setWorkScheduleName(String workScheduleName) {
		this.workScheduleName = workScheduleName;
	}
	public String getWorkStartTime() {
		return workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}
	public String getWorkEndTime() {
		return workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
