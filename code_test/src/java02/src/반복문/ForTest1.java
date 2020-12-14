package 반복문;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		//시작값;조건식;증감식;
		int iyou = 0;
		int you = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {//0~9, 10회 반복
			System.out.print("입력(1)아이유, (2)유재석, (3)방탄>> ");
			int data = sc.nextInt();
			switch (data) {
			case 1:
				iyou++;//증감연산자
				break;
			case 2:
				you++; //you = you + 1
				break;
			default:
				bts++; 
				break;
			}
		}
		System.out.println("아이유 : " + iyou);
		System.out.println("유재석 : " + you);
		System.out.println("방탄 : " + bts);
	}

}
