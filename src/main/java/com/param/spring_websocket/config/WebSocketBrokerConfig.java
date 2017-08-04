package com.param.spring_websocket.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker 
public class WebSocketBrokerConfig  extends AbstractWebSocketMessageBrokerConfigurer{

	  Random random;
	  
	  Map<String, String> userMap = new HashMap<String, String>();
	  
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/connect")
		//.setHandshakeHandler(new MyHandler())
		.withSockJS();//.setInterceptors(new WSSessionInterceptor());
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.setApplicationDestinationPrefixes("/app")
				.enableSimpleBroker("/topic", "/queue");
	}
	
	/*@Bean
    public DefaultHandshakeHandler handshakeHandler() {

        
        return new DefaultHandshakeHandler();
    }
	
	private class WSSessionInterceptor implements HandshakeInterceptor{

		@Override
		public boolean beforeHandshake(ServerHttpRequest request,
				ServerHttpResponse response, WebSocketHandler wsHandler,
				Map<String, Object> attributes) throws Exception {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void afterHandshake(ServerHttpRequest request,
				ServerHttpResponse response, WebSocketHandler wsHandler,
				Exception exception) {
			// TODO Auto-generated method stub
			//userMap.put(wsHandler., value)
//			request.getHeaders().
		}

	
		
	}*/
	
	
/*private class RandomUsernameHandshakeHandler extends DefaultHandshakeHandler{
	private String[] firstName = {"Santosh", "Rohan", "Suraj", "Pravin", "Nikhil", "Josephin"};
	
	private String[] lastName = {"Kunda", "Shevale", "Sanake", "Ulte", "Kharkate", "Aagave"};
	

	@Override
	protected Principal determineUser(ServerHttpRequest request,
			WebSocketHandler wsHandler, Map<String, Object> attributes) {
		String username = " by : "+getRandom(firstName)+"-"+getRandom(lastName)+"-"+random.nextInt();
		return new Principal() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return username;
			}
		}; //new UsernamePasswordAuthenticationToken(username, null);
	}




	private String getRandom(String[] arr){
		int rndom = random.nextInt(arr.length);
		return arr[rndom];
	}
}*/


}
