package 상속응용스레드;

import 상속개념.직원;

public class 매니저 extends 직원 {
	private int bonus;
	public void test() {
		System.out.println("이름은 " + name);
//		System.out.println("주소는 " + address); //안보임
		System.out.println("월급은 " + salary); 
		//다른 패키지라고 하더라고, 상속을 받은 경우에는 접근
//		System.out.println("주민번호는 " + rrn); //안보임
		System.out.println("관리감독하다.");
	}
	
	public String toString() {
		return "매니저 [bonus=" + bonus + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
