package day49_overriding_final;

public class SearchEngine {

    public SearchEngine covariant(){
        SearchEngine obj = new SearchEngine();
        return obj;
    }

    public int search(String item){
        System.out.println("Searching for... "+item+"\n Returning results count");
        return item.length();
    }

    protected void getResults(){
        System.out.println("Search Engine displaying result....");
    }

    String clickResult() {
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";
    }
}
