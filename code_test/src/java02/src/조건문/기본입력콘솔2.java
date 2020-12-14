package 조건문;

import java.util.Scanner;

public class 기본입력콘솔2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 >> ");
		String data = sc.next(); //한단어
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력 >> ");
		double weight = sc.nextDouble();
		System.out.print("저녁을 먹었나 >> ");
		boolean food = sc.nextBoolean();
		System.out.print("나의 좌우명은 >> ");
		sc.nextLine();//엔터처리
		String life = sc.nextLine();
		
		
		System.out.println("이름은 " + data);
		System.out.println("내년 키는 " + (height + 10));
		System.out.println("내년 몸무게는 " + (weight - 10));
		System.out.println("저녁을 먹었나요 " + food);
		System.out.println("내 좌우명은 " + life);
		
		

	}

}
