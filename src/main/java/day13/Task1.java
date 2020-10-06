package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Андрей И.");
        User u2 = new User("Максим В.");
        User u3 = new User("Игорь Д.");

        u1.sendMessage(u3, "Hi, u3:)");
        u1.sendMessage(u3, "How is it going?");

        u3.sendMessage(u1, "Good evening, u1");
        u3.sendMessage(u1, "I'm good, thanks!");

        u2.sendMessage(u1, "Hi, u1! What are you dong today?");
        u2.sendMessage(u1, "I'm watching football, why don't you come to me?");

        u1.sendMessage(u2, "Hello, u2. Why not! I'll be right now.");

        MessageDatabase.showDialog(u1, u3);
        System.out.println();

        System.out.println(MessageDatabase.getMessages());

        System.out.println(u1.isSubscribed(u3));
    }
}
