package com.param.spring_websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.param.spring_websocket.common.IError;
import com.param.spring_websocket.common.Response;
import com.param.spring_websocket.dto.LoginDto;
import com.param.spring_websocket.modal.PatientMst;
import com.param.spring_websocket.serviceimpl.LoginServ;
import com.param.spring_websocket.serviceimpl.PatientServ;

@Controller
@RequestMapping("/check")
public class RequestController implements IError {

	@Autowired
	private PatientServ patientServ;
	
	@Autowired
	private LoginServ loginServ;
	
	@RequestMapping("/")
	public String indexss(){
		System.out.println("login");
		return "login";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexs(){
		System.out.println("login");
		return "login";
	}
	
	@RequestMapping("/validateLogin")
	public String validateLogin(@RequestBody LoginDto loginDto, ModelMap model){
		 Response<PatientMst, Integer> resposne;
		try {
			resposne = loginServ.validateLogin(loginDto);
			if(resposne.getStatus().equals(SUCCESS)){
				model.addAttribute("response", resposne);
				return "/msgs/home";			
			}else{
				model.addAttribute("loginStatus", false);
				return "login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("******* Login failed ***********");
			model.addAttribute("loginStatus", false);
			return "login";
		}

	}
	
}
