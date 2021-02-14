package 예외처리;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("내가 첫줄" + "\n");
			file.write("내가 둘째줄" + "\n");
			file.write("내가 셋째줄" + "\n");
			file.close(); //stream을 닫아야 한다.
			System.out.println(3/0);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("파일에 저장하는 중 에러가 발생함.");
		} catch (ArithmeticException e2) {
			System.out.println("0으로 나누어서 에러발생했는데 내가 처리함.");
		} catch (Exception e) {
			System.out.println("위에서 잡지 않은 모든 예외처리를 내가 다 처리함.");
		} finally { //예외발생여부와 상관없이 무조건 실행하는 부분!
			System.out.println("휴~~예외처리 다 했음.");
		}

	}

}
