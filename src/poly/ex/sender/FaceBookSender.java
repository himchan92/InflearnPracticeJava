package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage() {
        System.out.println("페이스북 발송합니다.");
    }
}
