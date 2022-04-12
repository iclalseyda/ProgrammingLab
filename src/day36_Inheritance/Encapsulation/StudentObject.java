package day36_Inheritance.Encapsulation;

import day36_Inheritance.Encapsulation.Student;

public class StudentObject {

    public static void main(String[] args) {

        Student student1= new Student("Hulya",29, 'M','D', "MIT");
        student1.setAge(39);
        System.out.println(student1);
    }
}
