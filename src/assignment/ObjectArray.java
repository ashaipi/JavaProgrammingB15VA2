package assignment;

public class ObjectArray {
    public static void main(String[] args) {
        ObjectArray obj = new ObjectArray();
        obj.person("Abubaker", 51);
        ObjectArray[] ps = new ObjectArray[3];
        ps[0].person("Abubaker",45);
        ps[1].person("Ali",53);
        ps[2].person("Ashaipi",34);
        System.out.println(ps[0].name);
    }
    public String name;
    public void person(String n, int age){
        System.out.println("Name: "+name);
    }
}
