package 배열기본;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		// 좌석 예매상황을 나타내는 자리들(배열)
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		final int PRICE = 10000; //상수

		int count = 0;
		while (true) {
			System.out.println("=========================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			System.out.print("예매할 번호를 입력(종료-1)>> ");
			int no = sc.nextInt(); // "1"-->1
			if (no == -1) {
				System.out.println("예매 시스템을 종료합니다.");
				System.out.println("당신의 결제금액>> "+ (count * PRICE) + "원");
				break; // 반복문 종료
			}

			// 예매처리해야함.
			// no가 1이라면, 위치값은 0이 됨.
			if (seat[no - 1] != 1) {
				seat[no - 1] = 1;
				count++;
				System.out.println("예매처리 완료!");
			}else {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 번호를 선택해주세요.");
			}
		}
	}
}
