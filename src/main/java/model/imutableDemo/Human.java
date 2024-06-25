package model.imutableDemo;

public class Human {
    private String name;
    private String gender;
    private String age;
    private Dob birthdate;

    public Human() {
        this.name = name;
        this.gender = gender;
      //  this("ads","male","25",new Dob("20","08","1997"));
    }

   public Human(String name){
        this(name,"","",new Dob("20","08","1997"));
   }
    public Human(String name, String gender, String age) {
       /* this.name = name;
        this.gender = gender;
        this.age = age;*/
        this(name,gender,age,new Dob("20","08","1997"));
    }

    public Human(String name, String gender, String age, Dob birthdate) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthdate = birthdate;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
