package 스태틱;

public class 하루일과 {

	public static void main(String[] args) {
		//객체생성하기 전에 클래스이름으로 바로 접근 가능한 변수
		//static변수는 객체생성하지 않고도 접근 가능함.
		System.out.println(Day.count);
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(day1);
		System.out.println(Day.count);
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(Day.count);
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println(Day.count + "일");
		System.out.println(Day.sum +"시간");
		System.out.println(Day.sum/Day.count + "시간");
		Day.getAvg(); //static메서드!!!

	}

}
