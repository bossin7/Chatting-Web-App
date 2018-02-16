package br.com.chat.app.chatroom.domain.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.chat.app.chatroom.domain.model.ChatRoom;

public interface ChatRoomRepository extends CrudRepository<ChatRoom, String> {

}
