package lesson2.task2;

import lesson1.task2.ClassMessage;
import lesson1.task2.Client;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class ClassMessageTest {

    private final Client client1 = new Client("Oleg");
    private final Client client2 = new Client("Petya");

    @Before
    public void cleanUp() {
        ClassMessage.deleteUser(client1);
        ClassMessage.deleteUser(client2);
    }

    @Test
    public void userRegisteredTest() throws Exception {
        ClassMessage.registeringUsers(client1);
        ClassMessage.registeringUsers(client2);
        final Set<Client> clients = ClassMessage.clients;
        assertEquals(2, clients.size());
    }

    @Test(expected = Exception.class)
    public void userRegisteredErrorTest() throws Exception {
        final Client client3 = new Client("Oleg");
        ClassMessage.registeringUsers(client1);
        ClassMessage.registeringUsers(client3);
    }

    @Test(expected = Exception.class)
    public void sendMessageErrorTest() throws Exception {
        ClassMessage.sendMessage("userName",0, "Message");
    }

    @Test
    public void deleteUserTest() throws Exception {
        ClassMessage.registeringUsers(client1);
        ClassMessage.registeringUsers(client2);
        ClassMessage.deleteUser(client1);
        assertEquals(1, ClassMessage.clients.size());
    }
}
