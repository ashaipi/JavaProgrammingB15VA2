package day47_inheritance_02;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        FullTimeEmployee emp = new FullTimeEmployee("Jamil","SDET",5);
        System.out.println( emp.getName() );
        System.out.println(emp.getTitle());
        System.out.println(emp.getBonus());

        String str1 = "hello";
        String str2 = str1;
        String str3 = "hello";
        String str4 = "hello";
        if(str1==str4) System.out.println("true --");
        System.out.println(str1==str4);
        System.out.println(str2==str3);
    }
    public static void main(double[] a){
        System.out.println("Abubaker Ashaipi");
    }
}
