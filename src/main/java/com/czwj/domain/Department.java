package com.czwj.domain;

public class Department {
	private int id;
	private String depId;
	private String depName;
	private String remark;
	private String depParentId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDepParentId() {
		return depParentId;
	}
	public void setDepParentId(String depParentId) {
		this.depParentId = depParentId;
	}
	
}
