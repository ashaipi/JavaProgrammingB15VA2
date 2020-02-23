package day47_inheritance_02;

public class AudioBook extends Book{
    private double length;
    private String narrator; // the person who reading the book in audio book

    public void listen(){
        System.out.println("Listening to AudioBook written by ["+getAuthor()+"] with title ["+
                getTitle()+"]. Narrated by ["+getNarrator()+"]...");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
