package 생성자;

public class TV {
	int ch;
	int vol;
	boolean onOff;
	//클래스이름과 동일한 이름을 가진 메서드
	//자동으로 만들어진다.객체생성시 자동호출
	//생성자메서드, 기본생성자(메서드)
	public TV() {	
		System.out.println("객체생성시 꼭 실행하고 싶은 부분이 있으면 여기에 넣어요");
	}
	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	//생성자는 무조건 void이므로, 쓰지 않는다.
	
	
	public void on() {
		System.out.println("TV를 켜다.");
	}
	
	public void off() {
		System.out.println("TV를 끄다.");
	}
	
	@Override //재정의, 오버라이드
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
	
}
