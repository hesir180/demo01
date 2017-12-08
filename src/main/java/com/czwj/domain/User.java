package com.czwj.domain;

import java.sql.Timestamp;

public class User {
	private int id;
	private String userCode;
	private String password;
	private String userName;
	private String userSex;
	private String userBirthday;
	private String userDepId;
	private String userDepartment;
	private String userAddress;
	private String userPhone;
	private String userQQ;
	private String userEmail;
	private String userState;
	private String userRemark;
	private Timestamp createTime;
	private String onlineState;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserDepId() {
		return userDepId;
	}
	public void setUserDepId(String userDepId) {
		this.userDepId = userDepId;
	}
	public String getUserDepartment() {
		return userDepartment;
	}
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserQQ() {
		return userQQ;
	}
	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserRemark() {
		return userRemark;
	}
	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getOnlineState() {
		return onlineState;
	}
	public void setOnlineState(String onlineState) {
		this.onlineState = onlineState;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userCode=" + userCode + ", password=" + password + ", userName=" + userName
				+ ", userSex=" + userSex + ", userBirthday=" + userBirthday + ", userDepId=" + userDepId
				+ ", userDepartment=" + userDepartment + ", userAddress=" + userAddress + ", userPhone=" + userPhone
				+ ", userQQ=" + userQQ + ", userEmail=" + userEmail + ", userState=" + userState + ", userRemark="
				+ userRemark + ", createTime=" + createTime + ", onlineState=" + onlineState + "]";
	}
	
}
