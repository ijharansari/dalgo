import java.io.DataOutputStream;
import java.net.Socket;

public class ClientA extends CommonClient implements Client {

    ClientA(String ip,int port) {
        super(ip,port);
    }

    @Override
    public void connect() {
        try{
            super.socket = new Socket(super.ip,super.port);
            DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
            outStream.writeUTF("This is Client A");
            outStream.flush();
            outStream.close();
            super.socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Client client = new ClientA("localhost",7776);
        client.connect();
    }
}
