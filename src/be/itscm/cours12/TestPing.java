package be.itscm.cours12;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestPing {


	public static void main(String[] args) {

		InetAddress ia;
		try {
			ia = InetAddress.getByName("toto");
			System.out.println(ia.isReachable(1000));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
