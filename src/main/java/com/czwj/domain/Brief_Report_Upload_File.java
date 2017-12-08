package com.czwj.domain;

public class Brief_Report_Upload_File {
	private int id;
	private String file_Name;
	private String creat_Time;
	private int upload_File_Type;
	private String file_Path;
	private int brief_Create_Day;
	private int brief_Create_Hour;
	private int report_Create_Type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile_Name() {
		return file_Name;
	}
	public void setFile_Name(String file_Name) {
		this.file_Name = file_Name;
	}
	public String getCreat_Time() {
		return creat_Time;
	}
	public void setCreat_Time(String creat_Time) {
		this.creat_Time = creat_Time;
	}
	public int getUpload_File_Type() {
		return upload_File_Type;
	}
	public void setUpload_File_Type(int upload_File_Type) {
		this.upload_File_Type = upload_File_Type;
	}
	public String getFile_Path() {
		return file_Path;
	}
	public void setFile_Path(String file_Path) {
		this.file_Path = file_Path;
	}
	public int getBrief_Create_Day() {
		return brief_Create_Day;
	}
	public void setBrief_Create_Day(int brief_Create_Day) {
		this.brief_Create_Day = brief_Create_Day;
	}
	public int getBrief_Create_Hour() {
		return brief_Create_Hour;
	}
	public void setBrief_Create_Hour(int brief_Create_Hour) {
		this.brief_Create_Hour = brief_Create_Hour;
	}
	public int getReport_Create_Type() {
		return report_Create_Type;
	}
	public void setReport_Create_Type(int report_Create_Type) {
		this.report_Create_Type = report_Create_Type;
	}
	
}
