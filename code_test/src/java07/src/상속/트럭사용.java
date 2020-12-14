package 상속;

public class 트럭사용 {
	public static void main(String[] args) {
		Truck t = new Truck();
		t.color ="하늘색";
		t.speed = 100;
		t.weight = 1;
		t.출발하다();
		t.짐을나르다();
		t.멈추다();
		System.out.println(t);
				
		
	}
}
