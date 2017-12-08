package com.czwj.domain;

public class Ems_Entitymonthlyconsumption {
	private int id;
	private String entity_Code;
	private String energy_Code;
	private double entity_Current_Value;
	private double entity_Consumption;
	private String time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEntity_Code() {
		return entity_Code;
	}
	public void setEntity_Code(String entity_Code) {
		this.entity_Code = entity_Code;
	}
	public String getEnergy_Code() {
		return energy_Code;
	}
	public void setEnergy_Code(String energy_Code) {
		this.energy_Code = energy_Code;
	}
	public double getEntity_Current_Value() {
		return entity_Current_Value;
	}
	public void setEntity_Current_Value(double entity_Current_Value) {
		this.entity_Current_Value = entity_Current_Value;
	}
	public double getEntity_Consumption() {
		return entity_Consumption;
	}
	public void setEntity_Consumption(double entity_Consumption) {
		this.entity_Consumption = entity_Consumption;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
