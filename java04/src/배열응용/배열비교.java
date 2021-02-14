package 배열응용;

public class 배열비교 {

	public static void main(String[] args) {
		int[] n1 = {1, 2, 3};
		int[] n2 = {1, 5, 3};
		int count = 0;
		for (int i = 0; i < n2.length; i++) {
			if(n1[i] == n2[i]) {
				System.out.println(i + "번째 값이 동일함.");
				count++; //증감연산자, 1씩 증가
				//count = count + 1;
			}
		}
		System.out.println("총 동일한 개수는 " + count + "개");
		
		

	}

}
