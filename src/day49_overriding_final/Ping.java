package day49_overriding_final;

public class Ping extends Google{

    @Override
    public Ping covariant(){
        Ping obj = new Ping();
        return obj;
    }

    @Override
    public int search(String item){
        System.out.println("Ping  for... "+item+"\n Returning results count");
        return item.length()*2;
    }

}
