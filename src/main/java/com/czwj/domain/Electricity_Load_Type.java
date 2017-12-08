package com.czwj.domain;

public class Electricity_Load_Type {
	private int id;
	private String ElectricityLoadTypeCode;
	private String ElectricityLoadTypeName;
	private String WlectricityLoadTypeRemark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getElectricityLoadTypeCode() {
		return ElectricityLoadTypeCode;
	}
	public void setElectricityLoadTypeCode(String electricityLoadTypeCode) {
		ElectricityLoadTypeCode = electricityLoadTypeCode;
	}
	public String getElectricityLoadTypeName() {
		return ElectricityLoadTypeName;
	}
	public void setElectricityLoadTypeName(String electricityLoadTypeName) {
		ElectricityLoadTypeName = electricityLoadTypeName;
	}
	public String getWlectricityLoadTypeRemark() {
		return WlectricityLoadTypeRemark;
	}
	public void setWlectricityLoadTypeRemark(String wlectricityLoadTypeRemark) {
		WlectricityLoadTypeRemark = wlectricityLoadTypeRemark;
	}
	
}
