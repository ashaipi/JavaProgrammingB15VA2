package day44_static;

public class Coffee {
    private String name;
    private String size;
    private double price;

    public Coffee(){
        this.name="undecided";
        this.size="notSure";
        this.price=0.0;
    }

    public Coffee(String name, String size, double price) {
        this.name = name;
        this.setSize(size);
        this.price = price;
    }

    public String toString() {
        return "Coffee{name='"+name+"', size='" + size + "', price=" + price +'}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equals("tall")|size.equals("grande")|size.equals("venti"))
            this.size = size;
        else System.out.println("ERROR: Invalid size - "+size);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void drink(){
        System.out.println("Drinking "+size+" "+name+" for $"+price);
    }
}
