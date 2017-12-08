package com.czwj.domain;

public class Electro_Meter_Variable {
	private int id;
	private int electro_Quality_Variable_Id;
	private String variable_Code;
	private String variable_Name;
	private String meter_Code;
	private String meter_Name;
	private int meter_Type;
	private String energy_Code;
	private String energy_Name;
	private String remark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getElectro_Quality_Variable_Id() {
		return electro_Quality_Variable_Id;
	}
	public void setElectro_Quality_Variable_Id(int electro_Quality_Variable_Id) {
		this.electro_Quality_Variable_Id = electro_Quality_Variable_Id;
	}
	public String getVariable_Code() {
		return variable_Code;
	}
	public void setVariable_Code(String variable_Code) {
		this.variable_Code = variable_Code;
	}
	public String getVariable_Name() {
		return variable_Name;
	}
	public void setVariable_Name(String variable_Name) {
		this.variable_Name = variable_Name;
	}
	public String getMeter_Code() {
		return meter_Code;
	}
	public void setMeter_Code(String meter_Code) {
		this.meter_Code = meter_Code;
	}
	public String getMeter_Name() {
		return meter_Name;
	}
	public void setMeter_Name(String meter_Name) {
		this.meter_Name = meter_Name;
	}
	public int getMeter_Type() {
		return meter_Type;
	}
	public void setMeter_Type(int meter_Type) {
		this.meter_Type = meter_Type;
	}
	public String getEnergy_Code() {
		return energy_Code;
	}
	public void setEnergy_Code(String energy_Code) {
		this.energy_Code = energy_Code;
	}
	public String getEnergy_Name() {
		return energy_Name;
	}
	public void setEnergy_Name(String energy_Name) {
		this.energy_Name = energy_Name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
