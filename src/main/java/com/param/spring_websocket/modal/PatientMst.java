package com.param.spring_websocket.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ 
	 @NamedQuery(
			 name  = "HQL_GET_PATIENT_BY_USERNAME",
			 query = "SELECT pat.patientId, pat.patientName, pat.contactNo, pat.emailId,"
			 		+ " pat.patientDieses, pat.username, pat.password, pat.activeStatus, pat.loginStatus,"
			 		+ " pat.profilePic, pat.lastLogin"
			 		+ " FROM PatientMst pat"
			 		+ " WHERE pat.username = :username"
	 )
})

@Entity
@Table(name="ma_patient_mst")
public class PatientMst {

	@Id
	@GeneratedValue
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="contact_no")
	private String contactNo;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="patient_dieses")
	private String patientDieses;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="active_status")
	private char activeStatus;
	
	@Column(name="login_status")
	private char loginStatus;
	
	@Column(name="profile_pic")
	private String profilePic;
	
	@Column(name="last_login")
	private Date lastLogin;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPatientDieses() {
		return patientDieses;
	}

	public void setPatientDieses(String patientDieses) {
		this.patientDieses = patientDieses;
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

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	
}
