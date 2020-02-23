package day51_abstraction.student;

public class CampusStudent extends Student{

    @Override
    public void attendClass() {
        System.out.println("campusStudent attending class in campus...");
    }
}
