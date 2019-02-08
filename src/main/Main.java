package main;

import student.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Velimir");
        student.setLastName("Markovic");
        student.setYearOfBirth(1990);
        student.getCourse().setName("Software QA course");
        student.getCourse().setNumberOfClasses(32);
        student.getComputer().setProcessTact(4);
        student.getComputer().setMemory(16);
        student.getComputer().setHardDrive(2000);
        student.info();
    }

}
