package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//승인용 소켓
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("서버 시작됨. 클라이언트의 요청을 기다림.");
			while (true) {
				Socket socket = server.accept();
				System.out.println("클라이언트의 요청이 승인됨.");
			}
			//데이터 전송용 소켓
		} catch (Exception e) {
			System.out.println("서버 통신 중 에러 발생");
			e.printStackTrace();
		}
		
	}

}
