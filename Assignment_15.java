import java.io.DataInputStream;
import  java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Assignment_15 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(80);
        Socket s = ss.accept();
        System.out.println("Client Connected");
        DataInputStream d = new DataInputStream(s.getInputStream());
        String message = d.readUTF();
        System.out.println(message);

        ss.close();
        s.close();
        d.close();
    }
}
