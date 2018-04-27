package com.wyy.websoket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.xml.soap.Text;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component
public class FirstWebSoket extends AbstractWebSocketHandler {

    Set<WebSocketSession> all = new HashSet<>();
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println(session.getId()+"jianli");
                all.add(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String s =  message.getPayload();
        sendall(new TextMessage(s));
    }

    public void sendall(TextMessage textMessage) throws IOException {
        for (WebSocketSession session:all) {
            session.sendMessage(textMessage);
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println(session.getId()+"error");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        all.remove(session);
        System.out.println(session.getId()+"closed");
        System.out.println(status.getReason());
    }
}
