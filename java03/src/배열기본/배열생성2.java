package 배열기본;

public class 배열생성2 {

	public static void main(String[] args) {
		double[] s = new double[300];
		s[0] = 10.1;
		s[1] = 20.2;
		s[2] = 30.2;
		s[299] = 50.5;
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[s.length-1]);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
