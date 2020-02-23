package day11_string_comparison_logical;

public class USStates {
    public static void main(String[] args) {
        String state = "VA";
        // VA Virginia NY New York IL Illinois CA California

        if (state.equals("VA")) System.out.println("Virginia");
        else if (state.equals("NY")) System.out.println("New York");
        else if (state.equals("IL")) System.out.println("Illinois");
        else if (state.equals("CA")) System.out.println("California");
        else System.out.println("Some state, not in database");
    }
}
