package day29_review;

public class EmployeesData {
    public static void main(String[] args) {
        String str = "Phil salt [SDET] psalt@.co";
        // i want to extract job title
        // find the index of "["
        int n1 = str.indexOf("[")+1;
        int n2 = str.indexOf("]");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        
        // using substring extract job title - using n1, n2
        // substring(start, end) 2. substring(start) - from start till end
        String job = str.substring(n1,n2);
        System.out.println("job = " + job);

        // rewrite the above code into single statement.
        job = str.substring(str.indexOf("[")+1,str.indexOf("]"));
        System.out.println("job = " + job);
        
        //Task 2. extract firstName, lastName and assign to variable 
        String firstName = str.substring(0,str.indexOf(" "));
        System.out.println("firstName = " + firstName);
        String lastName = str.substring(str.indexOf(" ")+1,str.indexOf(" ["));
        System.out.println("lastName = " + lastName);

        String[] strArray = str.split(" ");
        System.out.println("firstName = " + strArray[0]);
        System.out.println("lastName = " + strArray[1]);
        //-------------------------------------------
        System.out.println("firstName = " + str.split(" ")[0]);
        System.out.println("lastName = " + str.split(" ")[1]);




    }
}
