package 조건문;

public class 조건이많을때 {

	public static void main(String[] args) {
		int jumsu = 88;
		//변수를 선언할 때 첫값을 넣어주어야함.(초기값)
		//초기값을 넣지 않으면, 쓰레기값이 들어있어서 프린트x, 연산x
		//변수를 선언할 때는 초기값을 꼭 넣어주어야한다.(초기화)
		String result = "";
		if (jumsu >= 90) {
			result = "A학점";
		}else if (jumsu >= 80) {
			result = "B학점";
		}else if (jumsu >= 70) {
			result = "C학점";
		}else {
			result = "D학점";
		}
		
		System.out.println("당신의 학점은 " + result);
	}

}
