package com.param.spring_websocket.dao;

import com.param.spring_websocket.modal.DoctorMst;
import com.param.spring_websocket.modal.PatientMst;
import com.param.spring_websocket.modal.StaffMst;

public interface LoginDao {

	public PatientMst getPatientByName(String username) throws Exception;
	
	public DoctorMst getDoctorByName(String username) throws Exception;
	
	public StaffMst getStaffByName(String username) throws Exception;
	
}
