package 배열기본;

public class 배열확인문제 {

	public static void main(String[] args) {
		// 5개의 int공간을 배열로 만들어서, 100~104까지 넣어서
		// 전체 프린트
		int[] s = new int[5];//{100, 101, 102, 103, 104}
		for (int i = 0; i < s.length; i++) {
			s[i] = 100 + i;
		//  s[0] = 100 + 0;
		//  s[1] = 100 + 1;
		//  s[2] = 100 + 2;
		//  s[3] = 100 + 3;
		//  s[4] = 100 + 4;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ": " + s[i]);
		}
		
		

	}

}
