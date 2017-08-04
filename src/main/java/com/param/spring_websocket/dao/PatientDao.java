package com.param.spring_websocket.dao;

import in.param.exception.ApplicationException;

import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.PatientMst;

public interface PatientDao {

	public Response validatePatientLogin(LoginDto loginDto) throws ApplicationException;
	
	public Response getPatientById(PatientMst patientMst) throws ApplicationException;
	
	public Response getPatientByUsername(PatientMst patientMst) throws ApplicationException;
	
}
