package poly.question1;

public class EmailSender implements Sender{
    String message;

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다: " + message);
        this.message = message;
    }
}
