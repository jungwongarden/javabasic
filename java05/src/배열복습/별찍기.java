package 배열복습;

public class 별찍기 {

	public static void main(String[] args) {
		
		for (int j = 0; j < 2; j++) { //행(가로줄)
			for (int i = 0; i < 10; i++) { //열(세로줄)
				System.out.print("@");
			}
			System.out.println();
		}
		
		int[][] num = new int[2][10];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------");
		num[0][0] = 100;
		num[1][1] = 200;
		num[1][9] = 300;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
