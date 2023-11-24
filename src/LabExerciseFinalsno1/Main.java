package LabExerciseFinalsno1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Angel Justine Ballaso", 2003, "October 29", "Information Technology");
        Instructor instructor = new Instructor("Phoebe Ruth Alithea Sudaria", 1989, "May 17", 80000);

        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}