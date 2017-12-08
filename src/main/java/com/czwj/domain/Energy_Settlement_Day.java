package com.czwj.domain;

public class Energy_Settlement_Day {
	private int id;
	private String energy_Code;
	private String energy_Name;
	private int settlement_Day;
	private String effective_Date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getSettlement_Day() {
		return settlement_Day;
	}
	public void setSettlement_Day(int settlement_Day) {
		this.settlement_Day = settlement_Day;
	}
	public String getEffective_Date() {
		return effective_Date;
	}
	public void setEffective_Date(String effective_Date) {
		this.effective_Date = effective_Date;
	}
	
}
