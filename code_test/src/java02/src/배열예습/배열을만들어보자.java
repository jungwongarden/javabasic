package 배열예습;

public class 배열을만들어보자 {

	public static void main(String[] args) {
			int[] s = new int[1000];
			System.out.println(s);
			
			s[0] = 100;
			System.out.println(s[0]);
			
			s[999] = 999;
			System.out.println(s[999]);
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
	}

}



