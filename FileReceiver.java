import java.io.*;
import java.net.*;

public class FileReceiver {
    public static void main(String[] args) {
        final int PORT = 9876;
        final String DESTINATION_FILE = "destination.txt"; // Change this to your destination file name

        try {
            // Create socket
            DatagramSocket socket = new DatagramSocket(PORT);
            byte[] buffer = new byte[1024];

            // Receive file size
            DatagramPacket sizePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(sizePacket);
            String fileSizeStr = new String(sizePacket.getData(), 0, sizePacket.getLength());
            long expectedFileSize = Long.parseLong(fileSizeStr);
            System.out.println("Expected file size: " + expectedFileSize + " bytes");

            // Create output file
            FileOutputStream fos = new FileOutputStream(DESTINATION_FILE);
            long totalBytesReceived = 0;

            // Receive file content
            while (totalBytesReceived < expectedFileSize) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                // Check for end marker
                String receivedData = new String(packet.getData(), 0, packet.getLength());
                if (receivedData.equals("END")) {
                    break;
                }

                // Write received data to file
                fos.write(packet.getData(), 0, packet.getLength());
                totalBytesReceived += packet.getLength();
                System.out.println("Received " + packet.getLength() + " bytes. Total: " + totalBytesReceived);
            }

            System.out.println("File received successfully!");
            fos.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("Error receiving file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
