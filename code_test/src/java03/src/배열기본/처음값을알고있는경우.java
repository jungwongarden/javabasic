package 배열기본;

public class 처음값을알고있는경우 {

	public static void main(String[] args) {
		//. => 접근 연산자
		//i++ => cpu가 i변수값을 가지고 1을 증가시킨 후, 
		//       다시 i변수에 저장
		//       i = i + 1;
		//       증감연산자
		String[] name = {"홍길동", "박길동", "홍길순", "홍길진"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		int[] age = {100, 90, 80, 70};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		double[] eye = {2.0, 1.5, 1.2, 0.5};
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		
		char[] gender = {'남', '여', '남', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		
	}

}
