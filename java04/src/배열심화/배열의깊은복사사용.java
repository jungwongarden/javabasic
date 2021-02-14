package 배열심화;

public class 배열의깊은복사사용 {

	public static void main(String[] args) {
		String[] 과목명 = {"국어", "수학", "영어"};
		int[] term1 = {10, 20, 30};
		//2학기의 점수는 1학기와 거의 유사, 세번째 과목만 40점임.
		int[] term2 = term1.clone();
		term2[2] = 40;
		
		//1,2학기 성적이 동일한 과목의 개수 프린트
		//1,2학기 성적이 동일한 과목명 프린트
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
				System.out.println(과목명[i]);
			}
		}
		System.out.println("과목수 " + count);
		
	}
}
