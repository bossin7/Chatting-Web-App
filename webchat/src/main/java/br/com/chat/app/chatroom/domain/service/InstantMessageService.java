package br.com.chat.app.chatroom.domain.service;

import java.util.List;

import br.com.chat.app.chatroom.domain.model.InstantMessage;

public interface InstantMessageService {
	
	void appendInstantMessageToConversations(InstantMessage instantMessage);
	List<InstantMessage> findAllInstantMessagesFor(String username, String chatRoomId);
}
