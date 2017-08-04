package com.param.spring_websocket.serviceimpl;

import java.util.List;

import in.param.exception.ApplicationException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.param.spring_websocket.common.ICommonConstants;
import com.param.spring_websocket.common.IError;
import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dao.PatientDao;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.DoctorMst;
import com.param.spring_websocket.modal.PatientMst;
import com.param.spring_websocket.modal.StaffMst;

@Service
public class LoginServImpl implements LoginServ, IError, ICommonConstants {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Autowired
	private PatientDao patientDao;
	
	@Override
	public PatientMst getPatientByName(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorMst getDoctorByName(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffMst getStaffByName(String username) throws Exception {
		return null;
	}

	@Override
	public Response validateLogin(LoginDto loginDto)
			throws ApplicationException {
		/*try{
			
			Session session = this.sessionFactory.getCurrentSession();
			Query query = session.getNamedQuery("HQL_GET_PATIENT_BY_USERNAME");
			query.setString("username", loginDto.getUsername());
			query.setString("password", loginDto.getPassword());
			List<PatientMst> listProductMst = query.list();
			
			Response<PatientMst, Integer> response = new Response<PatientMst, Integer>(SUCCESS, null, null, listProductMst);
			return response;

		}catch(Exception ex){
			ex.printStackTrace();
			throw new ApplicationException(ex.getMessage());
		}*/
		switch (loginDto.getUserType()) {
		case "P":	
				return patientDao.validatePatientLogin(loginDto);
		case "N":	
			return patientDao.validatePatientLogin(loginDto);
		case "D":	
			return patientDao.validatePatientLogin(loginDto);
		}
		
		Response<PatientMst, Integer> response = new Response<PatientMst, Integer>(ERROR, ERR_500, ERR_500_MESSAGE, null);
		return response;
	}

}
