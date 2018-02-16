package br.com.chat.app.utils;

import br.com.chat.app.chatroom.domain.model.InstantMessage;
import br.com.chat.app.chatroom.domain.model.InstantMessageBuilder;

public class SystemMessages {
	
	public static final InstantMessage welcome(String chatRoomId, String username) {
		return new InstantMessageBuilder()
				.newMessage()
				.withChatRoomId(chatRoomId)
				.systemMessage()
				.withText(username + " joined us :)");
	}

	public static final InstantMessage goodbye(String chatRoomId, String username) {
		return new InstantMessageBuilder()
				.newMessage()
				.withChatRoomId(chatRoomId)
				.systemMessage()
				.withText(username + " left us :(");
	}
}
