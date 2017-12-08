package com.czwj.domain;

public class Email_Seting {
	private int id;
	private String from_Email;
	private String email_Password;
	private String to_Email;
	private String subject;
	private int brief_Report_Upload_File_Id;
	private String attachment_Name;
	private int settlement_Day;
	private int settlement_Hour;
	private int report_Send_Type;
	private String content_Text;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom_Email() {
		return from_Email;
	}
	public void setFrom_Email(String from_Email) {
		this.from_Email = from_Email;
	}
	public String getEmail_Password() {
		return email_Password;
	}
	public void setEmail_Password(String email_Password) {
		this.email_Password = email_Password;
	}
	public String getTo_Email() {
		return to_Email;
	}
	public void setTo_Email(String to_Email) {
		this.to_Email = to_Email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getBrief_Report_Upload_File_Id() {
		return brief_Report_Upload_File_Id;
	}
	public void setBrief_Report_Upload_File_Id(int brief_Report_Upload_File_Id) {
		this.brief_Report_Upload_File_Id = brief_Report_Upload_File_Id;
	}
	public String getAttachment_Name() {
		return attachment_Name;
	}
	public void setAttachment_Name(String attachment_Name) {
		this.attachment_Name = attachment_Name;
	}
	public int getSettlement_Day() {
		return settlement_Day;
	}
	public void setSettlement_Day(int settlement_Day) {
		this.settlement_Day = settlement_Day;
	}
	public int getSettlement_Hour() {
		return settlement_Hour;
	}
	public void setSettlement_Hour(int settlement_Hour) {
		this.settlement_Hour = settlement_Hour;
	}
	public int getReport_Send_Type() {
		return report_Send_Type;
	}
	public void setReport_Send_Type(int report_Send_Type) {
		this.report_Send_Type = report_Send_Type;
	}
	public String getContent_Text() {
		return content_Text;
	}
	public void setContent_Text(String content_Text) {
		this.content_Text = content_Text;
	}
	
}
