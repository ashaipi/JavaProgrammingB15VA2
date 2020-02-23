package day11_string_comparison_logical;

public class WeatherIfElse {
    public static void main(String[] args) {
        String weather = "sunny";

        if(weather.equals("sunny")) System.out.println("Go to park\nCode java");
        else System.out.println("Go to school\nCode java");

        String item = "Wooden Spoon";
        if(item.equalsIgnoreCase("Wooden spoon"))
            System.out.println("15,938 Wooden spoons for sale");
        else
            System.out.println("no Wooden spoons");
    }
}
