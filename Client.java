import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",3301);
        DataOutputStream o = new DataOutputStream(s.getOutputStream());
        o.writeUTF("Jayeshp");
        o.writeUTF("Jayesh@008");

//        Receiving response from server
        DataInputStream d = new DataInputStream(s.getInputStream());
        String response = d.readUTF();
        System.out.println(response);
        o.flush();

        s.close();
        o.close();
    }
}
