package be.itscm.cours10;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestPing {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName("192.168.0.254");
			System.out.println(ia.isReachable(1000));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
