package com.param.spring_websocket.dao;

import org.springframework.stereotype.Repository;

import com.param.spring_websocket.modal.DoctorMst;
import com.param.spring_websocket.modal.PatientMst;
import com.param.spring_websocket.modal.StaffMst;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public PatientMst getPatientByName(String username) throws Exception {
		
		PatientMst mst = new PatientMst();
		if(username!=null){
			mst.setPatientId(1);
			mst.setUsername("Santosh");
			mst.setPassword("santosh123");
		}
		return mst;
	}

	@Override
	public DoctorMst getDoctorByName(String username) throws Exception {
		return null;
	}

	@Override
	public StaffMst getStaffByName(String username) throws Exception {
		return null;
	}


}
