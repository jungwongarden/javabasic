package 형변환;

public class 기본형형변환2 {
//캐스팅(CASTING, 던져졌다.) => 형변환
	public static void main(String[] args) {
		int age = 127; //___,___,___,000
		//~~~1000줄
		
		byte age2 = (byte)age;//___ 강제!
		//~~~1000줄
		//강제로 타입을 변경해준다.(강제형변환: 작<---- 큰)
		//강제형변환이 가능한 경우 범위에 포함된 타입이어야 함.
		
		int age3 = age2; //자동!(자동형변환: 큰<---- 작)

	}

}
