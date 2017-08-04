package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ma_patient_doc_mppr")
public class PatientDocMppr {

	@Id
	@GeneratedValue
	@Column(name="patient_doc_mppr_id")
	private int patientDocMpprId;
	
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="doc_id")
	private int docId;
	
	@Column(name="patient_unseen")
	private int patientUnseen;
	
	@Column(name="doc_unseen")
	private int docUnseen;

	public int getPatientDocMpprId() {
		return patientDocMpprId;
	}

	public void setPatientDocMpprId(int patientDocMpprId) {
		this.patientDocMpprId = patientDocMpprId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public int getPatientUnseen() {
		return patientUnseen;
	}

	public void setPatientUnseen(int patientUnseen) {
		this.patientUnseen = patientUnseen;
	}

	public int getDocUnseen() {
		return docUnseen;
	}

	public void setDocUnseen(int docUnseen) {
		this.docUnseen = docUnseen;
	}
	
	
	
}
