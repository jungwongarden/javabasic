package 배열심화;

public class 배열의깊은복사 {

	public static void main(String[] args) {
		// 깊은 복사: 배열의 주소가 가르키는 값들의 리스트를 복사
		// 국어, 영어, 수학, 컴퓨터(100)
		int[] term1 = {100, 99, 77, 44};
		int[] term2 = term1.clone();
		term2[3] = 100;
		
		System.out.print("1학기 성적>> ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + " ");
		}
		System.out.println();
		System.out.print("2학기 성적>> ");
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		System.out.println();
	}

}
