package day01;

//aaabbbcc
public class no1 {

	public static void main(String[] args) {
		int[] count = new int[26];
		// count[0] => a의 개수
		// count[1] => b의 개수
		
		String s = "aaabbbccc";
		char c1 = 'a';
		System.out.println(c1 + 1);
		System.out.println((int) c1);
		//char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		}
		
	}

}
