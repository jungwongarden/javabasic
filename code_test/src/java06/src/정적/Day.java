package 정적;

public class Day {
	String doing;
	int time;
	String location;
	static int count; //전역변수는 자동초기화=>0 
	static int total; //시간 누적
	
	public Day(String doing, int time, String location) {
		total = total + time;
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
}
