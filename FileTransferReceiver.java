import java.net.*;
import java.nio.file.*;

public class FileTransferReceiver {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(7000)) {
            byte[] buffer = new byte[65507]; // Maximum UDP packet size

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            // Create a new byte array with only the received data
            byte[] receivedData = new byte[packet.getLength()];
            System.arraycopy(packet.getData(), 0, receivedData, 0, packet.getLength());
            
            // Write the received data to file
            Files.write(Paths.get("receivedFile.txt"), receivedData);
            System.out.println("File received successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
