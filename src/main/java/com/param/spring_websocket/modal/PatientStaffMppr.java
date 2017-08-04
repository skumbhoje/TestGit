package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ma_patient_staff_mppr")
public class PatientStaffMppr {

	@Id
	@GeneratedValue
	@Column(name="patient_staff_mppr_id")
	private int patientStaffMpprId;
	
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="staff_id")
	private int staffId;
	
	@Column(name="patient_unseen")
	private int patientUnseen;
	
	@Column(name="staff_unseeen")
	private int staffUnseen;

	public int getPatientStaffMpprId() {
		return patientStaffMpprId;
	}

	public void setPatientStaffMpprId(int patientStaffMpprId) {
		this.patientStaffMpprId = patientStaffMpprId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public int getPatientUnseen() {
		return patientUnseen;
	}

	public void setPatientUnseen(int patientUnseen) {
		this.patientUnseen = patientUnseen;
	}

	public int getStaffUnseen() {
		return staffUnseen;
	}

	public void setStaffUnseen(int staffUnseen) {
		this.staffUnseen = staffUnseen;
	}
	
	
	
}
