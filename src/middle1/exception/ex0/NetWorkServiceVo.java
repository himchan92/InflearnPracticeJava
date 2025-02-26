package middle1.exception.ex0;

public class NetWorkServiceVo {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientVO client = new NetworkClientVO(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
