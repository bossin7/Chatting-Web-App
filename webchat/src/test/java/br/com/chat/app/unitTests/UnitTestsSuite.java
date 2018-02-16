package br.com.chat.app.unitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.chat.app.unitTests.chatroom.domain.service.RedisChatRoomServiceTest;
import br.com.chat.app.unitTests.chatroom.domain.model.InstantMessageBuilderTest;
import br.com.chat.app.unitTests.utils.DestinationsTest;
import br.com.chat.app.unitTests.utils.SystemMessagesTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  InstantMessageBuilderTest.class,
  DestinationsTest.class,
  SystemMessagesTest.class,
  RedisChatRoomServiceTest.class
})
public class UnitTestsSuite {

}
