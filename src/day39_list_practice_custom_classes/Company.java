package day39_list_practice_custom_classes;

public class Company {
    public static void main(String[] args) {
        //create object from Employee custom class.
        //new keyword
        Employee emp = new Employee();
        emp.name = "Kate";
        emp.age=30;
        emp.jobTitle = "QA Engineer";
        emp.work();

    }
}
