package day22statticblocksconstructors;

public class Student {


    String name;
    String stdId;
    String address;
    int age;
    int grade;

    public Student(String name, String stdId, String address, int age, int grade) {
        this.name = name;
        this.stdId = stdId;
        this.address = address;
        this.age = age;
        this.grade = grade;
    }


    public Student(String name, String stdId, int age) {
        this.name = name;
        this.stdId = stdId;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
