package demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPService {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(60000);
        byte[] bt = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bt, bt.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        String s = new String(data, 0, length);
        System.out.println(s);
        datagramSocket.close();
    }
}
