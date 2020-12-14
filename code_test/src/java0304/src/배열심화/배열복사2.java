package 배열심화;

public class 배열복사2 {

	public static void main(String[] args) {
		// 참조형(주소)
		int[] num = {100, 200, 300};
		//int[] num2 = num; //얕은 복사
		int[] num2 = num.clone();//깊은 복사
		
		System.out.println("num주소>> " + num);
		System.out.println("num2주소>> " + num2);
		
		System.out.print("num>>  ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.print("num2>> ");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println();
		
		num[0] = 999;
		System.out.print("변경후 num>>  ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.print("변경후 num2>> ");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println();

	}

}
