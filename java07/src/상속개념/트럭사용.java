package 상속개념;

public class 트럭사용 {
	//main을 선택하지 못한경우, main+컨트롤+스페이스바
	public static void main(String[] args) {
		Truck t = new Truck();
		t.color = "빨강"; //Car
		t.price = 1000; //Car
		t.weight = 1; //Truck
		
		t.move(); //Truck
		t.speedUp(); //Car
		
		
	}
}
