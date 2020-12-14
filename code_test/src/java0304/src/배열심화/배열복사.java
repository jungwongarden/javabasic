package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		//RAM에 있는 저장공간을 복사
		//저장공간 하나를 복사
		//기본형 복사
		//정수, 실수, 문자, 논리
		int num = 300;
		int num2 = num; 
		System.out.println("num값>> " + num);
		System.out.println("num2값>> " + num2);
		
		num = 500; //원래값 변경
		System.out.println("변경후 num값>> " + num);
		System.out.println("변경후 num2값>> " + num2);
	}

}
