//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson1.task2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public class ClassMessage {
    public static final Set<Client> clients = new HashSet();

    public ClassMessage() {
    }

    public static void registeringUsers(Client client) throws Exception {
        if (client != null && client.getFirst_name() != null && !client.getFirst_name().isEmpty() && !havingUser(client.getFirst_name())) {
            clients.add(client);
        } else {
            throw new Exception("User with this name is exist");
        }
    }

    private static boolean havingUser(String username) {
        Stream var10000 = clients.stream().map(Client::getFirst_name);
        Objects.requireNonNull(username);
        return var10000.anyMatch(username::equals);
    }

    public static void sendMessage(@Nullable String username, long mills, String message) throws Exception {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException var5) {
            System.out.println(var5.getMessage());
        }

        if (username != null && !username.isEmpty()) {
            if (!havingUser(username)) {
                throw new Exception("User don't exist");
            }

            System.out.printf("Message send to %s: %s", username, message);
        } else {
            System.out.printf("Message for all users: %s", message);
        }

    }

    public static void deleteUser(Client client) {
        clients.removeIf((curClient) -> {
            return curClient.getFirst_name().equals(client.getFirst_name());
        });
    }
}
