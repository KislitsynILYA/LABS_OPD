//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson1.task2;

public class UserReg {
    public UserReg() {
    }

    public static void main(String[] args) throws Exception {
        Client client1 = new Client("Oleg");
        Client client2 = new Client("Petya");
        ClassMessage.registeringUsers(client1);
        ClassMessage.registeringUsers(client2);
        ClassMessage.sendMessage("Petya", 2000L, "How are you?");
    }
}
