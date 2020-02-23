package assignment;

public class Test01 {
    public static void main(String[] args) {

        String name = "baeldung";
        String newName = name.replace("dung", "----");

        System.out.println(name);
        System.out.println(newName);

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >=0 ; j--) {
                if(i==j) continue;
                System.out.println(i+""+j);

            }
        }
    }

}
