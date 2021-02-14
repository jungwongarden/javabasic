package 배열기본;

public class 배열생성3 {

	public static void main(String[] args) {
		int[] s = new int[1000];
		//여러 공간에 반복적으로 공간을 이동하면서 
		//값들을 넣고자 하는 경우 배열사용하면 편함.
		for (int i = 0; i < s.length; i++) {
			s[i] = i + 1;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ": " + s[i]);
		}

	}

}
