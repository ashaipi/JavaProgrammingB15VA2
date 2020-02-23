package assignment;

public class Email {
    String receiver;
    String cc;
    String email;
    String subject;
    String body;
    String signature;
    String date;
    String folderName;
    boolean attachments;

    public void setReceiver(String email) {
        folderName = "Draft";
        if (email.contains("@")) {
            if (email.substring(email.indexOf("@")).contains(".")) {
                receiver = email;
            } else {
                System.out.println("Invalid domain extension. Please enter valid email");
            }
        } else {
            System.out.println("Email is not valid. Please enter valid email");
        }
    }

    public void setCC(String email) {
        if (email.contains("@")) {
            if (email.substring(email.indexOf("@")).contains(".")) {
                cc = email;
            } else {
                System.out.println("Invalid domain extention. Please enter valid email");
            }
        } else {
            System.out.println("Email is not valid. Please enter valid email");
        }
    }

    public void setSubject(String subject_value) {
        subject = subject_value;
    }

    public void setBody(String body_value) {
        body = body_value + "\n" + signature;
    }

    public void setSignature(String signature_value) {
        signature = signature_value;
    }

    public void setDate(String date_value) {
        date = date_value;
    }

    public void setAttachments(boolean attachments_value) {
        attachments = attachments_value;
    }

    public void  getEmailInfo(){
        System.out.println(receiver);
        System.out.println(cc);
        System.out.println(subject);
        System.out.println(body);
        System.out.println("Attachment: "+attachments);
        System.out.println("Folder Name: "+folderName);
        System.out.println(date);
    }
}
