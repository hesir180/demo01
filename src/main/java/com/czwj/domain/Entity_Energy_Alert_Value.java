package com.czwj.domain;

public class Entity_Energy_Alert_Value {
	private int id;
	private String entityCode;
	private String entityName;
	private String energyCode;
	private String energyName;
	private String unit;
	private double alertValue;
	private String remark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEntityCode() {
		return entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEnergyCode() {
		return energyCode;
	}
	public void setEnergyCode(String energyCode) {
		this.energyCode = energyCode;
	}
	public String getEnergyName() {
		return energyName;
	}
	public void setEnergyName(String energyName) {
		this.energyName = energyName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getAlertValue() {
		return alertValue;
	}
	public void setAlertValue(double alertValue) {
		this.alertValue = alertValue;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
