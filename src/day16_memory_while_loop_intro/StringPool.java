package day16_memory_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java"; // string pool
        String word2 = "java"; // string pool, re-use
        String word3 = new String("java"); // outside pool, in heap

        System.out.println(word1 == word2); // true. both are pointing to same object in pool
        System.out.println(word1 == word3);
        // false. because word1 and word3 are pointing to different object in heap.
        // when we use ==, it does not check if value are matching.
        // it only checks if variable are pointing to same object in memory.

        String word4 = new String("java");
        // check if word3 and word4 are point to same object.
        System.out.println(word3 == word4); // false. different object in memory.

        String word5 = word4; // point to same object as word4.
        System.out.println(word5 == word4); // true. they point to same object in heap.

        System.out.println(word1 == word4); // false. different objects in memory.
        System.out.println(word1.equals(word4)); // true. values match "java".

        String str = "macbook"; // string pool in HEAP.
        String str2 = "macbook"; // re-use "mackbook" in pool
        String str3 = str; // point to same object as str.
    }
}
