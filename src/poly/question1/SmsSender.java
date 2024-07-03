package poly.question1;

public class SmsSender implements Sender{
    String message;

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: " + message);
        this.message = message;
    }
}
