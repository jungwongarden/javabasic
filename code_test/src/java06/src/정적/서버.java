package 정적;

import java.io.IOException;
import java.net.ServerSocket;

public class 서버 {

	public static void main(String[] args) {
		//서버를 먼저 스타트해주어야 함.
		//프로그램이 문제가 생기면 중단된다.
		//네트워크 프로그램은 프로그램이 중단될
		//문제가 생길 여지가 너무 많음.
		//문제가 생기면 어떻게 할지를 꼭 써주어야 함.
		try {
			ServerSocket server = new ServerSocket(9100);
			System.out.println("서버 시작되어 클라이언트의 요청을 기다리는 중.");
			while (true) {
				server.accept(); //연결 승인!
				System.out.println("클라이언트 연결됨.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
