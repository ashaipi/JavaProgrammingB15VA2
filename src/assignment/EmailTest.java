package assignment;

public class EmailTest {
    public static void main(String[] args) {
        Email email1 = new Email();
        email1.setReceiver("f.l@dreamword.com");
        email1.setCC("jone.menta@dreamword.com");
        email1.setSubject("Subject of email");
        email1.setSignature("George Pollock \n SDET in Dreamwork ");
        email1.setDate("01-14-2020");
        email1.setBody("Everything we want");
        email1.setAttachments(false);

        email1.getEmailInfo();
    }
}
