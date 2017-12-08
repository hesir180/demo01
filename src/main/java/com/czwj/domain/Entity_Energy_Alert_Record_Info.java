package com.czwj.domain;

import java.util.Date;

public class Entity_Energy_Alert_Record_Info {
	private int id;
	private String entityCode;
	private String entityName;
	private String energyCode;
	private String energyName;
	private double alertValue;
	private double entityConsumption;
	private Date time;
	
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
	public double getAlertValue() {
		return alertValue;
	}
	public void setAlertValue(double alertValue) {
		this.alertValue = alertValue;
	}
	public double getEntityConsumption() {
		return entityConsumption;
	}
	public void setEntityConsumption(double entityConsumption) {
		this.entityConsumption = entityConsumption;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
