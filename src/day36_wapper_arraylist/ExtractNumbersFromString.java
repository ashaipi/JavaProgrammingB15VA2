package day36_wapper_arraylist;

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        String str = "jaVa123is45 fun0#";
        System.out.println(str.replaceAll("[^0-9]",""));

        for (int i = 0; i < str.length() ; i++)
            if(Character.isDigit(str.charAt(i))) System.out.print(str.charAt(i));
        System.out.println();

        System.out.println(str.replaceAll("[^a-zA-Z]",""));

        String letters="";
        String numbers="";
        for (int i = 0; i < str.length() ; i++)
            if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) numbers += str.charAt(i);
        System.out.println(letters);
        System.out.println(numbers);

        System.out.println(getAllNumbers("jadh"));
        System.out.println(getAllNumbers("192837kajdh"));
    }

    public static Integer getAllNumbers(String strNum){
        if(strNum.replaceAll("[^0-9]","").isEmpty()) return 0;
        return Integer.parseInt(strNum.replaceAll("[^0-9]",""));
    }
}
