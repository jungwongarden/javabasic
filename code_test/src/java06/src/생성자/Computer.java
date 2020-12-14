package 생성자;

public class Computer {
	int price;
	String color;
	
	//기본생성자는 다른 생성자가 없을 때는 자동으로 만들어진다.
	//다른 생성자가 있으면 안만들어진다.
	public Computer() {
	}

	//파라메터있는 생성자
	public Computer(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", color=" + color + "]";
	}
	
	
	
	
}
