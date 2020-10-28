package demo02;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bt = "hello java and python 哈哈哈".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bt, bt.length, InetAddress.getByName("127.0.0.1"), 10000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
