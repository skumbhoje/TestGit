package com.param.spring_websocket.config;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

	public List<WebSocketSession> sessions = new CopyOnWriteArrayList<WebSocketSession>();
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

		System.out.println("register websocket handler");
		registry.addHandler(new QuestionHandler(), "/connect").withSockJS();
	}
	
	
	class QuestionHandler extends TextWebSocketHandler{
		
		/*@Override
		public void afterConnectionEstablished(WebSocketSession session)
				throws Exception {
			System.out.println("-------------- connection establised---------------------");
			sessions.add(session);
		}
		
		@Override
		public void handleMessage(WebSocketSession session,
				WebSocketMessage<?> message) throws Exception {
			// TODO Auto-generated method stub
			super.handleMessage(session, message);
		}*/
		
		/*@Override
		protected void handleTextMessage(WebSocketSession session,
				TextMessage message) {
			System.out.println("mesage : "+message);
			for(WebSocketSession s: sessions){
				try {
					s.sendMessage(message);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/
		
	}

}
