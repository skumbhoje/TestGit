package com.param.spring_websocket.serviceimpl;

import in.param.exception.ApplicationException;

import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.DoctorMst;
import com.param.spring_websocket.modal.PatientMst;
import com.param.spring_websocket.modal.StaffMst;

public interface LoginServ {

		public PatientMst getPatientByName(String username) throws Exception;
		
		public DoctorMst getDoctorByName(String username) throws Exception;
		
		public StaffMst getStaffByName(String username) throws Exception;
		
		public Response validateLogin(LoginDto loginDto) throws ApplicationException;
		
}
