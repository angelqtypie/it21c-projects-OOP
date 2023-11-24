package LabExerciseFinalsno1;

public class Student extends Person {
    private String major;

    public Student(String name, int year, String birth, String major) {
        super(name, year, birth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }
}