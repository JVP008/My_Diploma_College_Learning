// Client1.java
import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.print("Enter User ID: ");
            String userId = consoleReader.readLine();
            System.out.print("Enter Password: ");
            String password = consoleReader.readLine();

            out.println(userId);
            out.println(password);

            String response = in.readLine();
            System.out.println("Server Response: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
