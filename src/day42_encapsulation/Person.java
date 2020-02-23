package day42_encapsulation;
    /*
    name should not be empty
    age can only be 0 - 170
     */
public class Person {
    // encapsulate below variables
    private String name;
    private int age;

   public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
       if(!newName.isEmpty()) name = newName;
       else System.out.println("ERROR: name cannot be empty");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
       if(newAge>=0 && newAge<=170) age = newAge;
       else System.out.println("ERROR: "+newAge+" invalid age");
    }
}
