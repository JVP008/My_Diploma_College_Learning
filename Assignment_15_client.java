import java.io.*;
import java.net.*;
public class Assignment_15_client {
    public static void main(String[] args) throws  IOException{
        Socket s = new Socket("local",80);
        DataOutputStream d = new DataOutputStream(s.getOutputStream());
        d.writeUTF("Hello MSBTE");
        d.flush();
        System.out.println("Message sent");
        s.close();
        d.close();
    }
}
