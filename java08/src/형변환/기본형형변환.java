package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 기본형 변수: 정수, 실수
		// 기본형 변수끼리의 데이터를 넣을 때 자동/강제 판단!
		// 큰 <--- 작 : 자동으로 큰 것으로 변환되어 들어감.(자동형변환)
		// int <--- byte
		byte x = 127;
		int y = x; //자동으로 들어감.!
		
		// 작 <--- 큰 : 강제로 작은 것으로 변환하여 넣어주어야함.(강제형변환)
		int x2 = 127;
		byte y2 = (byte)x2; //강제로 잘라서 넣어줌.!
		

	}

}
