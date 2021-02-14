package 배열복습;

public class 이차원배열 {

	public static void main(String[] args) {
		int[] one = new int[5];
		int[] two = new int[3];
		
		int[][] all = new int[2][];
		all[0] = one; //가로줄: 행(row), 첫번째 행
		all[1] = two; //두번째 행
		all[0][0] = 99;
		System.out.println(all[0][0]);
		
		int[][] all2 = new int[2][3];
		//배열은 자동초기화, 0으로 초기화=> 6개의 공간이 만들어짐.
		//		0	1	2	
		//0		0	0	0
		//1		0	0	0
		all2[0][0] = 99;
		all2[0][1] = 88;
		System.out.println(all2[0][0]);
		System.out.println(all2[0][1]);
		all2[0][2] = 77;
		all2[1][1] = 66;
		
		System.out.println(all2[0][2]);
		System.out.println(all2[1][1]);
		
	}

}
