package 상속;

public class 직원 extends Object{
	String name; //이름
	String address; //주소
	int salary; //월급
	int rrn; //주민번호
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
