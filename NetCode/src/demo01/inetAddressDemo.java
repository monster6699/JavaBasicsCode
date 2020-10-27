package demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("192.168.0.12");
        String hostName = byName.getHostName();
        String hostAddress = byName.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);


    }
}
