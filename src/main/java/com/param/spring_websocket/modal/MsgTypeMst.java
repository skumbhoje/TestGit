package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Santosh Kumbhoje.
 *
 */
@Entity
@Table(name="ma_mst_status_mst")
public class MsgTypeMst {

	@Id
	@GeneratedValue
	@Column(name="msg_status_id")
	private int msgStatusId;
	
	@Column(name="msg_status_name")
	private String msgStatusName;

	public int getMsgStatusId() {
		return msgStatusId;
	}

	public void setMsgStatusId(int msgStatusId) {
		this.msgStatusId = msgStatusId;
	}

	public String getMsgStatusName() {
		return msgStatusName;
	}

	public void setMsgStatusName(String msgStatusName) {
		this.msgStatusName = msgStatusName;
	}
	
	
	
}
