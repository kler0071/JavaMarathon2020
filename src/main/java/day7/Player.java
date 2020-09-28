package day7;

public class Player {
    private int stamina;

    private static int MAX_STAMINA = 100;
    private static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        while (stamina >= MIN_STAMINA) {
            if (stamina > MIN_STAMINA) {
                System.out.println("Выносливость игрока: " + stamina);
                stamina--;
            } else if (stamina == MIN_STAMINA) {
                System.out.println("Выносливость игрока: " + stamina + ", нужна замена");
                countPlayers--;
                break;
            }
        }
    }


    public void info() {
        countPlayers++;

        if (countPlayers < 6) {
            System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
        } else if (countPlayers == 6) {
            System.out.println("Мест в командах больше нет");
        } else {
            System.out.println("Мест в командах больше нет");
            countPlayers--;
        }
    }
}

