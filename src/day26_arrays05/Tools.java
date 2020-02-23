package day26_arrays05;

public class Tools {
    public static void main(String[] args) {
        /*
        Tools:
        Create a class Tools
        Create String array and store all those tools
        Loop through the array and check the tool.
        java     -> java     --> fun programming language
        selenium -> selenium --> test automation
        git      -> git      --> version control
        junit    -> junit    --> testing tool
        jenkins  -> jenkins  --> continuous integration
        cucumber -> cucumber --> BDD style testing
         */

        String[] tools = {"java     --> fun programming language",
                          "selenium --> test automation",
                          "git      --> version control",
                          "junit    --> testing tool",
                          "jenkins  --> continuous integration",
                          "cucumber --> BDD style testing"};
        String word = "java";
        for(String t : tools) if(t.startsWith(word)) System.out.println(t);
    }
}
