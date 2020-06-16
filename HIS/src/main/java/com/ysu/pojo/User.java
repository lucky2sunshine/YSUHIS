package com.ysu.pojo;

public class User {
	int id;
	String userName;
	String password;
	String realName;
	int userType;
	int doctitleID;
	char isScheduling;
	int deptID;
	int registLeID;
	int delMark;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", userType=" + userType + ", doctitleID=" + doctitleID + ", isScheduling=" + isScheduling
				+ ", deptID=" + deptID + ", registLeID=" + registLeID + ", delMark=" + delMark + "]";
	}

	public User() {
		super();
	}
	
	public User(int id, String userName, String password, String realName, int userType, int doctitleID,
			char isScheduling, int deptID, int registLeID, int delMark) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.userType = userType;
		this.doctitleID = doctitleID;
		this.isScheduling = isScheduling;
		this.deptID = deptID;
		this.registLeID = registLeID;
		this.delMark = delMark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getDoctitleID() {
		return doctitleID;
	}
	public void setDoctitleID(int doctitleID) {
		this.doctitleID = doctitleID;
	}
	public char getIsScheduling() {
		return isScheduling;
	}
	public void setIsScheduling(char isScheduling) {
		this.isScheduling = isScheduling;
	}
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public int getRegistLeID() {
		return registLeID;
	}
	public void setRegistLeID(int registLeID) {
		this.registLeID = registLeID;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	
	
}
