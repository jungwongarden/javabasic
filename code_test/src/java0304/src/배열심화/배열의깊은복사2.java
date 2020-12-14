package 배열심화;

public class 배열의깊은복사2 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();
		학기2성적[0] = 22;
		학기2성적[2] = 88;

//		0)전체 1학기, 2학기 성적 프린트
		for (int i = 0; i < 학기1성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		System.out.println();
		
//		1)1학기, 2학기 성적 중 동일한 성적과목수
		int count = 0;
		for (int i = 0; i < 학기2성적.length; i++) {
			if(학기1성적[i] == 학기2성적[i]) {
				count++;
			}
		}
		System.out.println("동일과목수: " + count + "개");
		
//		2)1학기, 2학기 성적 중 오른 과목수
		int count2 = 0;
		int index = 0; //2
		for (int i = 0; i < 학기2성적.length; i++) {
			if(학기1성적[i] < 학기2성적[i]) {
				count2++;
				index = i; //2
			}
		}
		System.out.println("오른과목수: " + count2 + "개");
		
//		3)1학기, 2학기 성적 중 오른 과목명
		System.out.println("오른과목명: " + 과목명[index]);

	}

}
