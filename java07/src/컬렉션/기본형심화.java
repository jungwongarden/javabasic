package 컬렉션;

public class 기본형심화 {

	public static void main(String[] args) {
		//정수: byte(1바이트, -128~127)->short(2바이트, -+3만)
		//		->int(4바이트, -+21억)->long(8)
		//실수: float(4바이트)->double(8바이트)
		//문자1: char
		//논리: boolean
		
		byte age = 127;
		int num = 35000;
		long space = 2222222222L; //l or L
		
		double pi = 3.14567892;
		float eye = 1.5f; //f or F
		
		//기본형 형변환
		: 자동형변환, 강제형변환
		byte x = 100; //1
		int y = x; //4(큰)<-1(작), 자동타입변환(자동형변환)
		
		int x2 = 100; //4
		byte y2 = (byte)x2; //1(작)<-4(큰), 강제타입변환(강제형변환)
		//강제형변환인 경우에는 형변환할 범위의 값만 가능
	}
}
