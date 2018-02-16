package br.com.chat.app.integrationTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.chat.app.integrationTests.authentication.api.AuthenticationControllerTest;
import br.com.chat.app.integrationTests.authentication.domain.service.DefaultUserServiceTest;
import br.com.chat.app.integrationTests.chatroom.api.ChatRoomControllerTest;
import br.com.chat.app.integrationTests.chatroom.domain.service.CassandraInstantMessageServiceTest;
import br.com.chat.app.integrationTests.chatroom.domain.service.RedisChatRoomServiceTest;
import br.com.chat.app.integrationTests.test.AbstractIntegrationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  CassandraInstantMessageServiceTest.class,
  RedisChatRoomServiceTest.class,
  DefaultUserServiceTest.class,
  AuthenticationControllerTest.class,
  ChatRoomControllerTest.class
})
public class IntegrationTestsSuite extends AbstractIntegrationTest {

}
