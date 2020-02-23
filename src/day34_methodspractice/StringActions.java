package day34_methodspractice;

public class StringActions {
    public static void main(String[] args) {
        System.out.println("The sentence has ["+countWords("java is fun")+"] words");
        System.out.println(countChars("java", 'a'));
        System.out.println(countChars("abubaker ali ashaipi", 'a'));
        System.out.println(countChars("abubaker ali ashaipi", 'i'));
    }

    public static int countChars(String str, char ch){
        int count=0;
        for (int i = 0; i <str.length() ; i++) if(str.charAt(i)==ch) count++;
        return count;
    }

    public static int countWords(String sentence){
        if(sentence.isEmpty()) return 0;
        return sentence.split(" ").length;
    }
}
