package 배열응용;

public class 배열개념확인2 {

	public static void main(String[] args) {
		// 
		String[] name = {"홍길동", "김길동","홍길순", "홍길정"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//for-each: 하나씩 오른쪽가면서 꺼내오는 것 반복
		for (String x : name) {
			 System.out.println(x);
		}
		
				

	}

}
