package day57_exceptions2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.*;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Before try catch");
        Files.readAllLines(Paths.get("file.txt")); //IOException

        try{
            Files.readAllLines(Paths.get("file.txt")); //IOException //NoSuchFileException

        }catch(IOException e){
            System.out.println("ERROR (IOException)- Exception happened and caught");
        }
        System.out.println("After try catch");
    }
}
