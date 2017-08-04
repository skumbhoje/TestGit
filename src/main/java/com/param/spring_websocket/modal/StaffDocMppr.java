package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ma_staff_doc_mppr")
public class StaffDocMppr {

	@Id
	@GeneratedValue
	@Column(name="staff_doc_mppr_id")
	private int staffDocMpprId;
	
	@Column(name="staff_id")
	private int staffId;
	
	@Column(name="doc_id")
	private int docId;
	
	@Column(name="staff_unseen")
	private int staffUnseen;
	
	@Column(name="doc_unseen")
	private int docUnseen;

	public int getStaffDocMpprId() {
		return staffDocMpprId;
	}

	public void setStaffDocMpprId(int staffDocMpprId) {
		this.staffDocMpprId = staffDocMpprId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public int getStaffUnseen() {
		return staffUnseen;
	}

	public void setStaffUnseen(int staffUnseen) {
		this.staffUnseen = staffUnseen;
	}

	public int getDocUnseen() {
		return docUnseen;
	}

	public void setDocUnseen(int docUnseen) {
		this.docUnseen = docUnseen;
	}
	
	
	
}
