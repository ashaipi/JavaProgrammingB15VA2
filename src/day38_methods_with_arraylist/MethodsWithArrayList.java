package day38_methods_with_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithArrayList {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(4,2,3);
        //ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(4,2,3));
        printList(listA);
        doubleTheList(listA);
        System.out.println(listA);
        System.out.println(sumList(listA));

    }
    /*
    Method: printList
    Parameter: List<Integer> list
    Return: void
    Print each value in same line separated by space
    listA = {4,2,3}
    printList(listA); => prints 4 2 3
    doubleTheList(nums); 8 , 4, 12
    print nums -> 8, 4, 12
     */
    public static Integer sumList(List<Integer> list){
        Integer sum=0;
        for(int i : list) sum+=i;
        return sum;
    }

    public static void doubleTheList(List<Integer> list){
        for (int i = 0; i < list.size() ; i++) list.set(i, list.get(i)*2);
        System.out.println(list);
    }

    public static void printList(List<Integer> list){
        for(int i : list) System.out.print(i+" ");
        System.out.println();
    }
}
