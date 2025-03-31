import java.net.*;
import java.nio.file.*;

public class FileTransferSender {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress receiverAddress = InetAddress.getByName("localhost");
            byte[] data = Files.readAllBytes(Paths.get("fileToSend.txt"));

            DatagramPacket packet = new DatagramPacket(data, data.length, receiverAddress, 7000);
            socket.send(packet);

            System.out.println("File transferred successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
