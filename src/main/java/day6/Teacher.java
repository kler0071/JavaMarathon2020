package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student, int mark) {
        String currentMark = null;
        if (mark == 5) {
            currentMark = "Отлично";
        } else if (mark == 4) {
            currentMark = "Хорошо";
        } else if (mark == 3) {
            currentMark = "Удовлетворительно";
        } else if (mark == 2) {
            currentMark = "Неудовлетворительно";
        } else {
            System.out.println("Неправильная оценка");
        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку " + currentMark);
    }
}


