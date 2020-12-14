package 상속;

public class 매니저 extends 직원 {
	//멤버변수4개, 메서드 1개
	
	int bonus;
	
	public void test() {
		System.out.println("관리감독하다.");
	}

	@Override
	public String toString() {
		return "매니저 [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn
				+ "]";
	}
}
