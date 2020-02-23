package assignment;

public class NonDuplicate {
        public static void main(String[] args) {
            String str = "AAABBCCCCCD";//print the non duplicate letter,
            String nonduplicate = "";  //output should be "ABCD"
            for (int i = 0; i < str.length() ; i++)
                if(!nonduplicate.contains(""+ str.charAt(i))) nonduplicate += str.charAt(i);
            System.out.println(nonduplicate);// add numbers to the characters , output should be A3B2C5D

            String letterAndCount = "";
            for (int j = 0, count=0 ; j < nonduplicate.length(); j++, count =0 ){
                for (int i = 0; i < str.length() ; i++)
                    if(nonduplicate.charAt(j) == str.charAt(i)) count++;
                letterAndCount +="" + nonduplicate.charAt(j) + count;
            }
            System.out.println(letterAndCount);
        }

}
