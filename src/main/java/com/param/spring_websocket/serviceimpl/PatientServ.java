package com.param.spring_websocket.serviceimpl;

import in.param.exception.ApplicationException;

import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dao.LoginDao;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.PatientMst;

public interface PatientServ {

	public Response validatePatientLogin(LoginDto loginDto) throws ApplicationException;
	
	public Response getPatientById(PatientMst patientMst) throws ApplicationException;
	
	public Response getPatientByUsername(PatientMst patientMst) throws ApplicationException;
	
}
