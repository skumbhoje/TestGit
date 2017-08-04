package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ma_staff_mst")
public class StaffMst {

	@Id
	@GeneratedValue
	@Column(name = "staff_id")
	private int staffId;
	
	@Column(name = "staff_unique_id")
	private String staffUniqueId;
	
	@Column(name = "staff_name")
	private String staffName;
	
	@Column(name = "mobileNo")
	private String mobileNo;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "active_status")
	private char activeStatus;
	
	@Column(name = "login_status")
	private char loginStatus;
	
	@Column(name = "profile_pic")
	private String profilePic;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffUniqueId() {
		return staffUniqueId;
	}

	public void setStaffUniqueId(String staffUniqueId) {
		this.staffUniqueId = staffUniqueId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(char activeStatus) {
		this.activeStatus = activeStatus;
	}

	public char getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(char loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	
	
}
