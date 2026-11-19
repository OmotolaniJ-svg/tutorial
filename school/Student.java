package school;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String department;
    private String courses;
    private int totalRegCousre;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }

    public void setTotalRegCousre(int totalRegCousre) {
        this.totalRegCousre = totalRegCousre;
    }

    public int getTotalRegCousre() {
        return totalRegCousre;
    }

    public String totalRegCourseLimit(int totalRegCourse) {
        if (totalRegCourse >= 7) {
            return "course overload";
        }
        return "Total Reg Course:" + totalRegCourse;
    }

    //import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            // take input from users
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your marks: ");
            double marks = input.nextDouble();

            // ternary operator checks if
            // marks is greater than 40
            String result = (marks > 40) ? "pass" : "fail";

            System.out.println("You " + result + " the exam.");
            input.close();
        }
    }
}