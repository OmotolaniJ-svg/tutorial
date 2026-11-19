package school;

public class Course {
    private String name;
    private String courseCode = "231";

    public Course(){

    }
    public Course(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Biology");
        course.setCourseCode("CSC234");

        String result = course.getName() + course.getCourseCode();
        System.out.println(result);
    }
}
