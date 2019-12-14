package com.goplayer.application.socket;

import static com.goplayer.application.util.Utils.gsonBuilderDeserializer;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.goplayer.application.socket.deserializer.PaginaDeserializer;
import com.goplayer.application.util.Pagina; 

@Component
public class WebSocket extends TextWebSocketHandler {
	
	List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		sessions.add(session);
	}
    
    @Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
    	session.close();
	}
	
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    	
    	System.out.println("M: " + message.getPayload());
    	
        Pagina pagina = (Pagina) gsonBuilderDeserializer(Pagina.class, new PaginaDeserializer(), message.getPayload());
        
        /*WebSocketController controller = new WebSocketController();
        controller.verificarAtualizacoes(pagina);*/
        
        verificarAtualizacoes();
        
    	session.sendMessage(new TextMessage("Hello Client!"));
    }
    
    //@Scheduled(fixedDelay = (long) 5000)
    private static void verificarAtualizacoes() throws IOException {
    	System.out.println("NewTeste");
    	//session.sendMessage(new TextMessage("Hello Client!"));
    }
}