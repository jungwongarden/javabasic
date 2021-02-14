package 배열응용;

public class 배열비교2 {

	public static void main(String[] args) {
		int[] n1 = { 44, 66, 77, 22, 11 };
		int[] n2 = { 33, 55, 77, 22, 40 };

		int count = 0; // 동일한 개수 세기
		int count2 = 0; // 동일하지 않은 개수 세기
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("동일한 개수 " + count + "개");
		System.out.println("동일하지 않은 개수 " + count2 + "개");

	}

}
