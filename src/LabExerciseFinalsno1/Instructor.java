package LabExerciseFinalsno1;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int year, String birth, double salary) {
        super(name, year, birth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}