package LabExerciseFinalsno1;

public class Person {
    private String name;
    private int year;
    private String birth;

    public Person(String name, int year, String birth) {
        this.name = name;
        this.year = year;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", birth='" + birth + '\'' +
                '}';
    }
}