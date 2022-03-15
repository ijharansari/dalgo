import java.net.Socket;
class CommonClient {
    protected int port;
    protected String ip;
    protected Socket socket;

    CommonClient(String ip,int port) {
        this.ip = ip;
        this.port = port;
    }
}
