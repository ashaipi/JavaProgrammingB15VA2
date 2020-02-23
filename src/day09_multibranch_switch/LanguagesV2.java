package day09_multibranch_switch;

public class LanguagesV2 {
    public static void main(String[] args) {

        String languages = "", greeting="";
        int option=28;
        if (option == 1) {
            languages = "English";
            greeting = "Hello!";
        } else if (option == 2) {
            languages = "Espanol";
            greeting = "Hola!";
        } else if (option == 3) {
            languages = "Francais";
            greeting = "Bonjour!";
        } else if (option == 4) {
            languages = "Arabia";
            greeting = "Ahlen!";
        } else if (option == 5) {
            languages = "Russkiy";
            greeting = "Privet!";
        } else if (option == 6) {
            languages = "Turkce";
            greeting = "Merhaba!";
        } else {
            languages = "L'Italiano";
            greeting = "Ciao!";
        }

        System.out.println("Language is \""+languages+"\" and greeting is \""+greeting+"\"");
        System.out.println("The  E N D !");
    }
}
