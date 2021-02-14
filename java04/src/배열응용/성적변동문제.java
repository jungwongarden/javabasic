package 배열응용;

public class 성적변동문제 {


	public static void main(String[] args) {
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		//1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
		//2. 성적이 1,2학기 동일한 학생의 수를 카운트해서 프린트
		int count = 0; //향상된 학생 수
		int count2 = 0; //동일한 학생 수
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}else if (term1[i] == term2[i]) {
				count2++; 
			}
		}
		System.out.println("향상된 학생수 " + count + "명");
		System.out.println("동일한 학생수 " + count2 + "명");
	}

}
