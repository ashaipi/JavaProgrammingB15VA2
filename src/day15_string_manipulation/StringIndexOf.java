package day15_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));
        int java, c, python, tomcat, aws, html;
        java = technologies.indexOf("java");
        c = technologies.indexOf("c");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");
        html = technologies.indexOf("html");

        System.out.println("java = " + java);
        System.out.println("c = " + c);
        System.out.println("python = " + python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aws = " + aws);
        System.out.println("html = " + html);

        if(technologies.contains("c++")) System.out.println("c++ is there");
        else System.out.println("c++ is not present");

        if(technologies.indexOf("c++")>=0) System.out.println("c++ is there");
        else System.out.println("c++ is not present");
        
        int firstComma = technologies.indexOf(",");
        System.out.println("firstComma = " + firstComma);
        
        int lastComma = technologies.lastIndexOf(",");
        System.out.println("lastComma = " + lastComma);
        
        int secondComma = technologies.indexOf(",",5);
        System.out.println("secondComma = " + secondComma);
        System.out.println("secondComma = " +technologies.indexOf(",",technologies.indexOf(",")+1));

        System.out.println("3edComma = " + technologies.indexOf(",",++secondComma));

        String url = "www.cybertekschool.okta.com";
        int firstDot=url.indexOf(".");
        System.out.println("firstDot = " + firstDot);
        int secondDot = url.indexOf(".",++firstDot);
        System.out.println("secondDot = " + secondDot);


    }
}
