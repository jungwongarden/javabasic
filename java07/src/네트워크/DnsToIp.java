package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DnsToIp {

	public static void main(String[] args) {
		//
		String dns = "www.daum.nett";
		
		try {
			InetAddress ip = InetAddress.getByName(dns); //InetAddress
			System.out.println("ip는 " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(dns + "에 해당하는 ip가 없음.");
		}

	}

}
