package student;

import computer.Computer;
import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Course getCourse() {
        return this.course;
    }

    public Computer getComputer() {
        return this.computer;
    }
    
    public Student() {
        this.firstName = "Velimir";
        this.lastName = "Markovic";
        this.yearOfBirth = 1990;
        this.course = new Course();
        this.computer = new Computer();
    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        System.out.println("First Name: ");
        System.out.println("Last Name: ");
        System.out.println("Year of birth: ");
        System.out.println("Course name: ");
        System.out.println("Course number of classes: ");
        System.out.println("Process tact: ");
        System.out.println("Memory: ");
        System.out.println("Hard driver: ");
        System.out.println("");
    }

}
