<html>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.1.3/material.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.1/sockjs.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.min.js"></script>
<script>
	// simple websocket
	/* var ws = new WebSocket("ws://localhost:9090/spring_websocket/question"); */
	
	// Using stomp 
	var ws = new SockJS("/spring_websocket/connect");
	var stompClient;
	
	$(document).ready(function(){
		/* ws.open = function(){
			console.log('connetion open');
			ws.send('here i Am');
		}
		
		ws.onmessage = function(event){
			console.log('on message.. '+event.data);
			
			$('#questionContainer').append('<div>'+event.data+'</div> ??');
		}
		
		ws.onclose= function(event){
			console.log('connection close '+event.code);
		}
		
		$('#idAddBtn').click(function(){
			sendForm();
			$('#sample3').val('');
		});
		
		sendForm = function(){
			alert('Question to send : '+$('#sample3').val());
			ws.send($('#sample3').val());
		} */
		
		$('#idAddBtn').click(function(){
			sendForm();
			$('#sample3').val('');
		});
		
		$('#idAddBtn1').click(function(){
			sendAll();
			$('#sample3').val('');
		});
		
		sendForm = function(){
			alert('Question to send : '+$('#sample3').val());
			stompClient.send('/app/oneToOne', {} ,$('#sample3').val());
		}
		
		sendAll = function(){
			alert('Mst to send All: '+$('#sample3').val());
			stompClient.send('/app/toAll', {} ,$('#sample3').val());
		}
		
		stompClient = Stomp.over(ws);

		stompClient.connect({}, function(frame){
			
			stompClient.subscribe("/topic/toAll", function(message){
				//Console.log("subscription : "+message.body);
				$('#questionContainer').append('<div>'+message.body+'</div> ??');
			},
			
			
			
			function(error){
				console.log('STOMP error: '+error);
			});
			
			stompClient.subscribe("/user/topic/oneToOne", function(message){
				//Console.log("subscription : "+message.body);
				$('#questionContainer').append('<div> From user '+message.body+'</div> ??');
			},
			function(error){
				console.log('STOMP error: '+error);
			});
			
		});
	});
</script>
<body>
<h2>Hello World!</h2>

<div id="questionContainer">

</div>



<!-- Model Dialog -->


	<!-- <div class="mdl-textfield mdl-js-textfield">
    	<input class="mdl-textfield__input" type="text" id="sample1">
    	<label class="mdl-textfield__label" for="sample1">Text...</label>
  </div> -->
  
  <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
    <input class="mdl-textfield__input" type="select" id="toUser">
    <label class="mdl-textfield__label" for="toUser">To User</label>
  </div>
  
  <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
    <input class="mdl-textfield__input" type="text" id="sample3">
    <label class="mdl-textfield__label" for="sample3">Question</label>
  </div>
	<!-- Colored FAB button -->
<button class="mdl-button mdl-js-button mdl-button--fab mdl-button--colored" id="idAddBtn" >
  <i class="material-icons">add</i>
</button>

<!-- Colored FAB button -->
<button class="mdl-button mdl-js-button mdl-button--fab mdl-button--colored" id="idAddBtn1" >
  <i class="material-icons">ToALL</i>
</button>

</body>

</html>
