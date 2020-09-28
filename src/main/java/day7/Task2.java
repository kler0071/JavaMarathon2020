package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(91);
        Player player3 = new Player(93);
        Player player4 = new Player(99);
        Player player5 = new Player(99);
        Player player6 = new Player(100);
        System.out.println();

        player1.info();
        player2.info();
        player3.info();
        player4.info();
        player5.info();
        player6.info();
        System.out.println();

        player1.run();
        System.out.println();

        System.out.println("Количество игроков на поле: " + Player.countPlayers);

    }
}
