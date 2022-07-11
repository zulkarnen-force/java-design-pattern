package oop;
import java.lang.reflect.Type;

import oop.Student;

public class TestType {
    public static void main(String[] args) {

        Student student = new Student();
        student.setUsername("username");
        System.out.println(student.username);

        // 
        System.out.println(student instanceof User); // true

        Worker workStudent = new Worker();
        workStudent.setUsername("Student worker");
        System.out.println(workStudent.getUsername());
        System.out.println(workStudent instanceof Student);

        // UserBuilder userBuilder = new UserBuilder(student);
        // userBuilder.sayHello();

        String[] kerja = new String[2];
        kerja[0] = "satu";
        kerja[1] = "dua";
        workStudent.kerja(kerja);
    }

}