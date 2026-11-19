package school;

public class Teacher extends Person implements Teach{

    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teachCourse(Course Course){
        System.out.println(getName() + "is teaching" + Course.getName());
    }
}
