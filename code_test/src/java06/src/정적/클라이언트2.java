package 정적;

import java.io.IOException;
import java.net.Socket;

public class 클라이언트2 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 연결요청함.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
