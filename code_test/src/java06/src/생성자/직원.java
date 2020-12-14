package 생성자;

public class 직원 {
	String name;
	int age;
	char gender;
	static int count;
	static int total;
	
	public 직원(String name, int age, char gender) {
		count++;
		total = total + age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//객체생성하지 않고, 클래스이름으로 바로 접근하여
	//호출할 수 있는 메서드
	public static int getAvg() {
		return total/count;
		//static메서드내에서 사용하는 변수들은
		//static변수만 가능하다.!
		//total:static변수는 객체생성하지 않아도,
		//      class이름으로 접근해서 사용가능.
	}
	
	

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
