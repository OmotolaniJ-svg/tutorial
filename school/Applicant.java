package school;

public class Applicant {
    private String name;
    private int age;
    private String address;
    private String gender;


    public Applicant(){

    }
    public Applicant(String name, int age, String address, String gender){
        this.name =name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        System.out.println(name + gender + address + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
public int ageLimit(int age){
        if(age >= 10){
            return age;
        }else{
            return 0;
        }
}
    public static void main(String[] args) {
        Applicant applicant = new Applicant();
        applicant.setAddress("2,Obantoko\n");
        applicant.setGender("Female\n");
        applicant.setName("Tiwa\n");
        applicant.setAge(applicant.ageLimit(50));

        Applicant applicant1 = new Applicant();
        applicant1.setAddress("2,Somorin\n");
        applicant1.setGender("Male\n");
        applicant1.setName("Olasunkanmi\n");
        applicant1.setAge( 20);

        String result = "Name:"+applicant.getName() +"Address:" + applicant.getAddress() + "Gender:" + applicant.getGender() +"Age:"+ applicant.getAge() ;
        String result1 = "Name:"+applicant1.getName() +"Address:" + applicant1.getAddress() + "Gender:" + applicant1.getGender() +"Age:"+ applicant1.getAge() ;
        System.out.println(result);
        System.out.println(result1);
    }
}
