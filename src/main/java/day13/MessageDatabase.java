package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        List<Message> list = new ArrayList<>();
        for (Message mess : messages) {
            list.add(mess);
        }
        return list;
    }

    public static void showDialog(User u1, User u2) {
        for (Message m : messages) {
            if (m.getSender() == u1 & m.getReceiver() == u2 || m.getSender() == u2 & m.getReceiver() == u1) {
                System.out.println(m.getSender() + ": " + m.getText());
            }
        }
    }
}
