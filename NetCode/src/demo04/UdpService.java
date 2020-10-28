package demo04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpService {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(1314);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            String s = new String(data, 0, length);
            System.out.println(s);
        }

    }

}
