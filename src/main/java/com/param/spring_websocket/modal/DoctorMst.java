package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ma_doctor_mst")
public class DoctorMst {

	@Id
	@GeneratedValue
	@Column(name ="doctor_id")
	private int doctorId;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="contact_no")
	private String contactNo;
	
	@Column(name ="emailId")
	private String emailId;
	
	@Column(name ="deegree")
	private String deegre;
	
	@Column(name ="active_status")
	private String activeStatus;
	
	@Column(name ="login_status")
	private char loginStatus;
	
	@Column(name ="username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	@Column(name ="profile_pic")
	private String profilePic;
	
	@Column(name ="last_login")
	private String lastLogin;
	
	@Column(name ="speciality")
	private String speciality;
	
	/*@OneToMany 
	private PatientDocMppr patientDocMppr;*/

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDeegre() {
		return deegre;
	}

	public void setDeegre(String deegre) {
		this.deegre = deegre;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public char getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(char loginStatus) {
		this.loginStatus = loginStatus;
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

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
}
