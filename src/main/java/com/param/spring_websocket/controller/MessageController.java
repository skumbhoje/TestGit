package com.param.spring_websocket.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Locale;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/msg")
public class MessageController {

	/*@Autowired
	private SimpMessagingTemplate template;*/
	
	HashMap<String, String> userMap = new HashMap<String, String>();
	
	@MessageMapping("/oneToOne")
	public void processQuestion(Principal principal,String msg){
		String text = "[" + getTimestamp() + "]:" + msg+" By :" + principal.getName() + "!";
		//this.template.convertAndSend("/topic/question", msg.toUpperCase()+" by Admin");
		//this.template.convertAndSendToUser("Santosh", "/topic/oneToOne", text);
		
	}
	
	@MessageMapping("/toAll")
	public void processMessageToAll(Principal principal,String msg){
		String text = "[" + getTimestamp() + "]:" + msg+" By :" + principal.getName() + "!";
		//this.template.convertAndSend("/topic/toAll", msg.toUpperCase());
		//this.template.convertAndSendToUser("Santosh", "/topic/oneToOne", text);
		
	}
	

	@RequestMapping(value="/home")
	public String loginSuccess(Model model, Principal principal, Locale locale){
		
		//System.out.println("SessionID: "+session.getId());
		   // Get a simple human readable date and time
		/*Calendar cal = Calendar.getInstance();
		Date dateRepresentation = cal.getTime();
		
        String formattedDate = dateRepresentation.toString();

        // Get the logged in user's name
        String userName = principal.getName();

        // Set some sample messages to show on the landing 'basicWebsockets.jsp' page.
        model.addAttribute("username", userName);
        model.addAttribute("time", formattedDate);*/


        return "index";
	}
	
	
	public String getTimestamp(){
		return "6:3. PM";
	}
}
