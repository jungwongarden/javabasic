package 조건문;

import java.util.Scanner;

public class 기본입력콘솔 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 >> ");
		String data = sc.next();
		System.out.println("이름은 " + data);
		
		System.out.print("나이 입력 >> ");
		int data2= sc.nextInt(); //String->int
		System.out.println("내년나이는 " + (data2 + 1));

	}

}
