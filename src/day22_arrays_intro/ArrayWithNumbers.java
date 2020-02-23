package day22_arrays_intro;

public class ArrayWithNumbers {
    public static void main(String[] args) {
        // declare numsArry with 5 numbers
        // assign values to each index

        int[] numsArray = {12,23,34,45,67};

        for (int i = 0; i <numsArray.length ; i++) System.out.println(numsArray[i]);

        int[] numsArray3 = new int[]{32,45,4563,234,546};
        System.out.println("---------------------------");
        int n1=23, n2=34, n3=56;
        double n4=2.3;
        char n5='A';
        int[] numsArray4 = {n1,n2,n3,34,(int) n4,(int) n5,765};
        for (int i = 0; i <numsArray4.length ; i++) System.out.println("numsArray["+i+"] = "+numsArray4[i]);
        System.out.println("numsArray4 length = "+numsArray4.length);
        System.out.println(numsArray4[numsArray4.length-1]);

        for(int i=0,j=0,k=0 ; i<numsArray.length && i<numsArray3.length && i<numsArray4.length ; i++, j++,k++)
            System.out.println(numsArray[i]+"  "+numsArray3[j]+"  "+numsArray4[k]);

        System.out.println("------------------------");
        for (int i = 0; i <numsArray3.length ; i++) if(numsArray3[i]>100) System.out.println(numsArray3[i]);

        System.out.println("------------------------");
        for (int i = numsArray3.length-1; i >= 0 ; i--) System.out.println(numsArray3[i]);




    }
}
