package 배열기본;

public class 특정한값찾기 {

	public static void main(String[] args) {
		int[] num = {11, 44, 66, 22, 55};
		//22가 있는지 프로그램 완성해보세요!
		for (int i = 0; i < num.length; i++) {
			System.out.println(i);
			if(num[i] == 22) {
				System.out.println("22를 찾음.");
				System.out.println("위치는 " + i);
				break;
			}
		}
	}

}
