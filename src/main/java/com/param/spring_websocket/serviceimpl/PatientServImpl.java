package com.param.spring_websocket.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.param.exception.ApplicationException;

import com.param.spring_websocket.common.ICommonConstants;
import com.param.spring_websocket.common.IError;
import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dao.PatientDao;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.PatientMst;

@Service
public class PatientServImpl implements PatientServ, IError, ICommonConstants {

	@Autowired
	public PatientDao patientDao;
	
	@Override
	public Response getPatientById(PatientMst patientMst)
			throws ApplicationException {
		return patientDao.getPatientById(patientMst);
	}

	@Override
	public Response getPatientByUsername(PatientMst patientMst)
			throws ApplicationException {
		return patientDao.getPatientByUsername(patientMst);
	}

	@Override
	public Response validatePatientLogin(LoginDto loginDto)
			throws ApplicationException {
		return patientDao.validatePatientLogin(loginDto);
	}


}
