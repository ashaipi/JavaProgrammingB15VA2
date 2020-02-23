package day43_constructor;

public class Pet {
    private String type;
    private String name;

    public void speak(){
        switch(type){
            case "dog": System.out.println("wof wof"); break;
            case "cat": System.out.println("meow meow"); break;
            case "fish": System.out.println("pq pq pq... "); break;
            case "bird": System.out.println("sew sew sew"); break;
            case "lion": System.out.println("roar"); break;
        }
    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Pet feed(){
        return this;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
