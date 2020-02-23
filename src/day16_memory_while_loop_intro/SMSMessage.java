package day16_memory_while_loop_intro;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [John Doe] From Number<2024331234>, Message:{Hey, whats up! Lets code some java!}";
        String sender, fromNumber, txt;
        int start = message.indexOf("[")+1;
        int end = message.indexOf("]");
        sender=message.substring(start,end);

        start = message.indexOf("<")+1;
        end = message.indexOf(">");
        fromNumber=message.substring(start,end);

        start = message.indexOf("{")+1;
        end = message.indexOf("}");
        txt=message.substring(start,end);

        System.out.println("Sender:  "+sender);
        System.out.println("Phone:   "+fromNumber);
        System.out.println("Message: "+txt);
        
        String str = "    Abubaker Ashaipi    ";
        System.out.println("str.trim() = [" + str.trim()+"]");
    }
}
