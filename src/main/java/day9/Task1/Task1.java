package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иванов Олег", "Э-19");
        Teacher teacher = new Teacher("Елена Петровна", "Геометрия");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
