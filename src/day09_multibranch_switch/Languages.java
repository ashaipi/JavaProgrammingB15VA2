package day09_multibranch_switch;

public class Languages {
    public static void main(String[] args) {
        System.out.println("1-English");
        System.out.println("2- Spanish");
        System.out.println("3-France");
        System.out.println("4-Arabic");
        System.out.println("5-Russkiy");
        System.out.println("6-Turkce");
        System.out.println("Else-Italiano");
        System.out.println("___________");
        int languages = 5;

        if (languages == 1) System.out.println("Hello!");
        else if (languages == 2) System.out.println("Hola!");
        else if (languages == 3) System.out.println("Bonjour!");
        else if (languages == 4) System.out.println("Ahlen!");
        else if (languages == 5) System.out.println("Privet!");
        else if (languages == 6) System.out.println("Merhaba!");
        else System.out.println("Ciao!");

        System.out.println("The  E N D !");

    }
}
