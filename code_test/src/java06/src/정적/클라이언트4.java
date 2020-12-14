package 정적;

import java.io.IOException;
import java.net.Socket;

public class 클라이언트4 {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 1000; i++) {
				Socket socket = new Socket("localhost", 9100);
				System.out.println(i + "번 클라이언트: 클라이언트 연결요청함.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
