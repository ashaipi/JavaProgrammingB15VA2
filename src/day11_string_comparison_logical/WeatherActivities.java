package day11_string_comparison_logical;

public class WeatherActivities {
    public static void main(String[] args) {
        String weather = "sunny";

        switch(weather){
            case "sunny":
                System.out.println("Go to park\nCode java");
                break;
            case "hot":
                System.out.println("Go swimming\nCode java");
                break;
            case "windy":
                System.out.println("Fly a kite\nCode java");
                break;
            case "snowy":
                System.out.println("build a snowman\nCode java");
            case "rainy":
                System.out.println("stay home\nCode java");
            default:
                System.out.println("keep coding java in any weather");
        }
        /*
        double num=1.5;
        switch(num){
            case 1.5: System.out.println("d"); break;
            case 1.6: System.out.println("d"); break;
            case 1.7: System.out.println("d"); break;
        }
        */
    }
}
