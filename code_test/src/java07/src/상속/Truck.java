package 상속;

public class Truck extends Car {
	int weight;
	
	public void 짐을나르다() {
		System.out.println("물건을 싣고 나르다.");
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", color=" + color + ", speed=" + speed + "]";
	}
	
	
}
