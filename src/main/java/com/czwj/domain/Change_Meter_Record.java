package com.czwj.domain;

import java.sql.Timestamp;

public class Change_Meter_Record {
	private int id;
	private String meterCode;
	private Timestamp changeTime;
	private String operator;
	private String remark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeterCode() {
		return meterCode;
	}
	public void setMeterCode(String meterCode) {
		this.meterCode = meterCode;
	}
	public Timestamp getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
