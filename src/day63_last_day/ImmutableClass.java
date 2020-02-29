package day63_last_day;

public class ImmutableClass {
    private String comment;
    @Override
    public String toString() {
        return "ImmutableClass{" +
                "comment='" + comment + '\'' +
                '}';
    }
    public ImmutableClass(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }
}
