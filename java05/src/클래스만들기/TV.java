package 클래스만들기;

public class TV {
	//변수의 선언=> 타입 변수명;
	//선언의 위치=> 변수가 생존(사용)할 수 있는 범위
	//멤버멤수 => 전역변수(클래스 안 전체영역에서 사용 가능)
	//         global변수, 글로벌 변수
	//글로벌변수는 자동초기화를 해준다.
	//new할때 복사가 되는 이 전역변수를 "인스턴스변수"
	//인스턴스라는 말은 실제값이라는 의미
	//new할때 전역변수가 복사가 되어 생성된 부품의 실제값이 저장되기 때문
	public int ch; //0으로 초기화
	public int vol;
	public boolean onOff; //false초기화

	public void 채널을바꾸다() {
		int change = 1; //지역변수, local변수, 로컬변수
		System.out.println(ch + change +"번호로 바꾸다.");
	}

	public void 유튜드보다() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
	
	
	
}
