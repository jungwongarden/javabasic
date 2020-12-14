package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.print("숫자입력>> ");
			int data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("당신의 시도횟수는 " + count);
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("정답이 아닙니다.");
				if (data > target) {
					System.out.println("너무 커요");
				}else {
					System.out.println("너무 작아요");
				}
			}
		}
	}

}
