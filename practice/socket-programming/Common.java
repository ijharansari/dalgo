import java.net.Socket;
public class Common {
    protected int port;
    protected String ip;
    protected Socket socket;

    Common(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
