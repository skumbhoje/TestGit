package com.param.spring_websocket.modal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ma_msg_mst")
public class MsgMst {

	@Id
	@GeneratedValue
	@Column(name="msg_id")
	private int msgId;
	
	@Column(name="from_id")
	private int fromId;
	
	@Column(name="to_id")
	private int toId;
	
	@Column(name="from_type")
	private int fromType;
	
	@Column(name="to_type")
	private int toType;
	
	@Column(name="sent_time")
	private Date sentTime;
	
	@Column(name="received_time")
	private Date receivedTime;
	
	@Column(name="msg_seen_time")
	private Date msgSeenTime;
	
	@Column(name="msg_status")
	private int msgStatus;
	
	@Column(name="is_from_delete")
	private int isFromDelete;
	
	@Column(name="is_to_delete")
	private int isToDelete;
	
	@Column(name="msg_type")
	private int msgType;
	
	@Column(name="msg")
	private String msg;
	
	@Column(name="symbol_id")
	private int symbolId;
	
	@Column(name="pdf_url")
	private String pdfUrl;

	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	public int getToId() {
		return toId;
	}

	public void setToId(int toId) {
		this.toId = toId;
	}

	public int getFromType() {
		return fromType;
	}

	public void setFromType(int fromType) {
		this.fromType = fromType;
	}

	public int getToType() {
		return toType;
	}

	public void setToType(int toType) {
		this.toType = toType;
	}

	public Date getSentTime() {
		return sentTime;
	}

	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}

	public Date getReceivedTime() {
		return receivedTime;
	}

	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	public Date getMsgSeenTime() {
		return msgSeenTime;
	}

	public void setMsgSeenTime(Date msgSeenTime) {
		this.msgSeenTime = msgSeenTime;
	}

	public int getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(int msgStatus) {
		this.msgStatus = msgStatus;
	}

	public int getIsFromDelete() {
		return isFromDelete;
	}

	public void setIsFromDelete(int isFromDelete) {
		this.isFromDelete = isFromDelete;
	}

	public int getIsToDelete() {
		return isToDelete;
	}

	public void setIsToDelete(int isToDelete) {
		this.isToDelete = isToDelete;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getSymbolId() {
		return symbolId;
	}

	public void setSymbolId(int symbolId) {
		this.symbolId = symbolId;
	}

	public String getPdfUrl() {
		return pdfUrl;
	}

	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}
	
	
	
}
