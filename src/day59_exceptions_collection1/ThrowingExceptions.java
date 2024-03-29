package day59_exceptions_collection1;

public class ThrowingExceptions {
    public static void main(String[] args) {
        // create object of Arithmetic exception
        ArithmeticException ar = new ArithmeticException();
        Throwable ar2 = new ArithmeticException("cannot / by 0");

        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());

        //System.out.println(9/0);
        //throw ar;

        // System.out.println("java"); // ERROR

        String userName = "";
        if(userName.isEmpty()){
            //throw new RuntimeException("username cannot be empty");
        }else{
            System.out.println("username is valid");
        }

        int age = 20 ;
        if(age>18){
            System.out.println("Eligible to vote");
        }else{
            /*
            Throw to indicate that a method has been passed and illegal or
            inappropriate argument.
             */
            throw new IllegalArgumentException("ineligible to vote");
        }

        int month = 2;
        if(month >= 1 && month <= 12){
            System.out.println("Valid month - "+month);
        }else{
            throw new RuntimeException("Invalid month - "+month);
        }

        int[] nums = {44, 55, 11};
        int index = 2;
        if(index>=0 && index<=nums.length){
            System.out.println("Valid index - "+index);
        }else{
            throw new RuntimeException("Invalid index - "+index);
        }

        String firstName = "Nadir";
        if(firstName == null){
            throw new NullPointerException("First name cannot be null");
        }

        for (int i = 0; i < firstName.length() ; i++) {
            System.out.print(firstName.charAt(i));
        }
        System.out.println();

        System.out.println(getWeekDayName(1));
    }

    public static String getWeekDayName(int day){
        String dayName="";
        if(day<1 || day>7) throw new IllegalArgumentException("Invalid day - "+day);
        switch (day){
            case 1: dayName= "Monday";    break;
            case 2: dayName= "Tuesday";   break;
            case 3: dayName= "Wednesday"; break;
            case 4: dayName= "Thursday";  break;
            case 5: dayName= "Friday";    break;
            case 6: dayName= "Saturday";  break;
            case 7: dayName= "Sunday";    break;
        }
        return dayName;
    }
}
