import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
public class Server {
    private int port;
    private Socket socket;

    Server(int port) {
        this.port = port;
    }

    public void start() {
        try{
            ServerSocket server = new ServerSocket(port);
            socket = server.accept();
    
            //read input from clients
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            String message = (String)inputStream.readUTF();
            System.out.println(message);

            //close
            inputStream.close();
            server.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Server server = new Server(7776);
        server.start();
    }
}