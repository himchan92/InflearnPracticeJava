package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMessage() {
        System.out.println("SMS 발송합니다.");
    }
}
