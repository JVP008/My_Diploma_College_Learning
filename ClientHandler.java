import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    private String clientName;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.output = new PrintWriter(socket.getOutputStream(), true);
            this.clientName = "Client-" + socket.getPort();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = input.readLine()) != null) {
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println(clientName + " has left the chat.");
                    break;
                }
                System.out.println(clientName + ": " + message);
            }
        } catch (IOException e) {
            System.out.println(clientName + " disconnected unexpectedly.");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        output.println(message);
    }
} 