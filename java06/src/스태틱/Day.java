package 스태틱;

public class Day {
	String doing; //인스턴스 변수
	int time; //인스턴스 변수
	String location; //인스턴스 변수
	static int count;//전역변수는 자동 초기화. 클래스 변수, 정적 변수
	//전역변수 중에서 생성된 객체간에 누적시킬 변수가 있으면
	//생성된 객체마다 따로 따로 만들어서 각 객체의 실제값(instance)를 넣지말고,
	//클래스당 하나만 가지면서 생성된 객체에서 공유하여 쓸 수 있는 변수를 만들어라.!
	static int sum; //전역변수, 클래스변수
	//객체생성과 상관없이 클래스당 하나만 가지고 있으면서 공유해서 사용하는 변수
	
	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	public static void getAvg() {
		//static메서드 내에서 사용하는 전역변수는 반드시 static이 되어야 함.
		System.out.println(sum / count);
	}
	
}





