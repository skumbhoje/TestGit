package com.param.spring_websocket.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ma_symbol_mst")
public class SymbolMst {

	@Id
	@GeneratedValue
	@Column(name="symbol_mst_id")
	private int symbolId;

	@Column(name="symbol_name")
	private String symbolName;
	
	@Column(name="url")
	private String symbolURL;

	public int getSymbolId() {
		return symbolId;
	}

	public void setSymbolId(int symbolId) {
		this.symbolId = symbolId;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getSymbolURL() {
		return symbolURL;
	}

	public void setSymbolURL(String symbolURL) {
		this.symbolURL = symbolURL;
	}
	
	
}
