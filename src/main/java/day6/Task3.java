package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Стакутис М.В.", "Матричная алгебра");
        Student student = new Student("Попов М.А.");

        teacher.evaluate(student,5);
    }
}
