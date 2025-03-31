import java.net.*;
import java.io.*;
public class Server {
    final static  String username = "Jayeshp";
    final static String password = "Jayesh@008";
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3301); //wait for the client request
        Socket s = ss.accept(); //Communication with client
        System.out.println("Client Connected");
        DataInputStream d = new DataInputStream(s.getInputStream());
        String username = (String) d.readUTF();
        String password = (String) d.readUTF();
        if(Server.username.equals(username)&& Server.password.equals(password))
        {
            System.out.println("Authorized");
        }
        else
        {
            System.out.println("You are Not Authorized");
        }

        d.close();
        s.close();
        ss.close();
    }
}
