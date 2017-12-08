package com.czwj.domain;

import java.util.Date;

public class Ems_Spfv {
	private int id;
	private String spfv_Code;
	private String spfv_Name;
	private Date start_Date;
	private Date end_Date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpfv_Code() {
		return spfv_Code;
	}
	public void setSpfv_Code(String spfv_Code) {
		this.spfv_Code = spfv_Code;
	}
	public String getSpfv_Name() {
		return spfv_Name;
	}
	public void setSpfv_Name(String spfv_Name) {
		this.spfv_Name = spfv_Name;
	}
	public Date getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}
	
}
