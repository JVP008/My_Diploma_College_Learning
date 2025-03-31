import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        final int PORT = 12345;
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started. Waiting for clients...");

            // Start a thread to handle server console input
            new Thread(() -> {
                try {
                    BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
                    String message;
                    while ((message = consoleInput.readLine()) != null) {
                        if (message.equalsIgnoreCase("exit")) {
                            System.exit(0);
                        }
                        broadcastMessage("Server: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Accept client connections
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected!");
                ClientHandler clientHandler = new ClientHandler(socket);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }
}
