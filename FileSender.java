import java.io.*;
import java.net.*;

public class FileSender {
    public static void main(String[] args) {
        final int PORT = 9876;
        final String RECEIVER_ADDRESS = "localhost";
        final String SOURCE_FILE = "source.txt"; // Change this to your source file name

        try {
            // Create socket
            DatagramSocket socket = new DatagramSocket();
            InetAddress receiverAddress = InetAddress.getByName(RECEIVER_ADDRESS);

            // Read the file
            File file = new File(SOURCE_FILE);
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[1024]; // Buffer size for each packet
            int bytesRead;

            // Send file size first
            String fileSize = String.valueOf(file.length());
            byte[] sizeBytes = fileSize.getBytes();
            DatagramPacket sizePacket = new DatagramPacket(sizeBytes, sizeBytes.length, receiverAddress, PORT);
            socket.send(sizePacket);

            // Send file content
            while ((bytesRead = fis.read(buffer)) != -1) {
                DatagramPacket packet = new DatagramPacket(buffer, bytesRead, receiverAddress, PORT);
                socket.send(packet);
                System.out.println("Sent packet of size: " + bytesRead);
            }

            // Send end marker
            String endMarker = "END";
            byte[] endBytes = endMarker.getBytes();
            DatagramPacket endPacket = new DatagramPacket(endBytes, endBytes.length, receiverAddress, PORT);
            socket.send(endPacket);

            System.out.println("File sent successfully!");
            fis.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("Error sending file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
