package 기본데이터;

public class 기본데이터종류4 {

	public static void main(String[] args) {
		// 기본데이터 4가지
		// 정수, 실수, 문자1, 논리(boolean)
		int age; //RAM에 저장공간 age라는 것을 만들어라!
		         //age안에는 int(정수만!)
				 //데이터타입 저장공간이름;
		age = 100; //기호(간단한 처리)
		
		double weight = 100.34; //100
		
		char gender = '남'; //홑따옴표를 써야함.
		
		//자동완성(컨트롤+스페이스바)
		boolean food = true; //false
		
		//syso, sysout(컨트롤+스페이스바)
		System.out.println("나이는 " + age);
		System.out.println(weight);
		System.out.println(gender);
		System.out.println("점심을 먹었나요? " + food);
		
		//= : RAM저장공간에 데이터를 넣을 때 사용하는 기호(연산자)
		//== : 비교연산자는 기본데이터만 비교가능!
		//food == gender(가능)
		//food == System(불가능)
		
		
		
		
		
		

	}

}
