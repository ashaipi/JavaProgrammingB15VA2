package day34_methodspractice;

public class FormatString {
    public static void main(String[] args) {
        System.out.println(getNumberOfGoogleSearchResult("About 1,250,000,000 @results (0.71 seconds)"));
        String st = "About 1,250,000,000 results (0.71 seconds)";
        System.out.println("1- "+st.replaceAll("[^0-9.]","")); // replace ever thing with "" except  number and dot
        System.out.println("2- "+st.replaceAll("[^0-9]",""));  // replace ever thing with "" except numbers
        System.out.println("3- "+st.replaceAll("[0-9]",""));   // replace number with ""
        System.out.println("4- "+st.replaceAll("[^\\d-]","")); // Regex
        System.out.println("5- "+st.replaceAll("[^\\D*]",""));
        System.out.println("6- "+st.replaceAll("[^a-z]",""));
        System.out.println("7- "+st.replaceAll("[^A-z ]",""));
        System.out.println("8- "+st.replaceAll("[^A-Z]",""));
        System.out.println("9- "+st.replaceAll("[^\\w]",""));
        System.out.println("10-"+st.replaceAll("[^\\W]",""));
        System.out.println("11-"+st.replaceAll("[^o.]",""));

        repeatString("java", 3, '%');
        System.out.println(repeatReturnString("cats", 4, '#'));
    }

    public static String repeatReturnString(String word, int times, char delimiter){
        String str="";
        for (int i = 0; i < times ; i++) str+=word+delimiter;
        return str;
    }

    public static void repeatString(String word, int times, char delimiter){
        for (int i = 0; i < times ; i++) System.out.print(word+delimiter);
        System.out.println();
    }

    public static long getNumberOfGoogleSearchResult(String str){
        return Long.parseLong(str.split(" ")[1].replace(",",""));
    }
}
