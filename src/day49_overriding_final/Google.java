package day49_overriding_final;

public class Google extends SearchEngine {

    @Override
    public Google covariant(){
        Ping ob = new Ping();
        return ob;
    }

    @Override
    public int search(String item){
        System.out.println("Googling  for... "+item+"\n Returning results count");
        return item.length()*2;
    }

    @Override
    protected void getResults(){

        System.out.println("Search Engine displaying result....");
    }

}
