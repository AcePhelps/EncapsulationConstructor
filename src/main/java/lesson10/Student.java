package lesson10;

public class Student extends Person {

    private int studentId;
    private String major;

    public Student(String name, String lastName, int year, int studentId, String major) {
        super(name,lastName,year);
        this.studentId = studentId;
        this.major = major;

    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
