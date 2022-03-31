package lesson10;

public class ParttimeTeacher extends Teacher{
    private String schedule;

    public ParttimeTeacher(String name, String lastName, int year, String subject, String schedule) {
        super(name, lastName, year, subject);
        this.schedule = schedule;
    }
}
