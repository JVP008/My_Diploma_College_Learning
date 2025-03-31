import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost"; // Server address
        final int PORT = 12345; // Port number

        try (Socket socket = new Socket(SERVER_ADDRESS, PORT)) {
            System.out.println("Connected to the server!");

            // Create input & output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            // Start a thread to handle incoming messages
            new Thread(() -> {
                try {
                    String message;
                    while ((message = input.readLine()) != null) {
                        System.out.println(message);
                        if (message.equalsIgnoreCase("Server: exit")) {
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                    System.exit(1);
                }
            }).start();

            // Handle outgoing messages
            String message;
            while ((message = consoleInput.readLine()) != null) {
                output.println(message);
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            System.out.println("Chat ended.");
        } catch (IOException e) {
            System.out.println("Could not connect to server. Make sure the server is running.");
            e.printStackTrace();
        }
    }
}
