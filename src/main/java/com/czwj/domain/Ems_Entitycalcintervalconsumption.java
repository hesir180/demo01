package com.czwj.domain;

import java.sql.Timestamp;

public class Ems_Entitycalcintervalconsumption {
	private int id;
	private String entity_Code;
	private String energy_Code;
	private double Entity_Current_Value;
	private double Entity_Consumption;
	private Timestamp time;
	
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
		return Entity_Current_Value;
	}
	public void setEntity_Current_Value(double entity_Current_Value) {
		Entity_Current_Value = entity_Current_Value;
	}
	public double getEntity_Consumption() {
		return Entity_Consumption;
	}
	public void setEntity_Consumption(double entity_Consumption) {
		Entity_Consumption = entity_Consumption;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
