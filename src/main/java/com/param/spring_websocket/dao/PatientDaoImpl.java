package com.param.spring_websocket.dao;

import in.param.common.dao.GenericDao;
import in.param.exception.ApplicationException;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.param.spring_websocket.common.ICommonConstants;
import com.param.spring_websocket.common.IError;
import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.PatientMst;

@Repository
public class PatientDaoImpl extends GenericDao<PatientMst, Integer> implements PatientDao, IError, ICommonConstants {

	public PatientDaoImpl() {
		super(PatientMst.class);
	}

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Response getPatientById(PatientMst patientMst)
			throws ApplicationException {
			try{
				
				Session session = this.sessionFactory.getCurrentSession();
				Query query = session.getNamedQuery("HQL_GET_PATIENT_BY_USERNAME");
				query.setString("username", patientMst.getUsername());
				List<PatientMst> listProductMst = query.list();
				
				Response<PatientMst, Integer> response = new Response<PatientMst, Integer>(SUCCESS, null, null, listProductMst);
				return response;
	
			}catch(Exception ex){
				ex.printStackTrace();
				throw new ApplicationException(ex.getMessage());
			}
	}

	@Override
	public Response getPatientByUsername(PatientMst patientMst)
			throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response validatePatientLogin(LoginDto loginDto)
			throws ApplicationException {
		try{
			
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
		}
	}
	
	

}
