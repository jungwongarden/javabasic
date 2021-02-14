package 배열심화;

public class 변수의복사참조형 {

	public static void main(String[] args) {
		int[] x = {10, 20, 30};
		//int[] y = x; //주소만 복사!(배열의 얕은 복사)
		int[] y = x.clone(); //목록을 복사!(배열의 깊은 복사)
		System.out.print("변경전 X: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("변경전 Y: ");
		for (int a : y) {
			System.out.print(a + " ");
		}
		System.out.println("\n--------------");
		x[0] = 99; //변경후
		System.out.print("변경후 X: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("변경후 Y: ");
		for (int a : y) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("X의 주소: " + x);
		System.out.println("Y의 주소: " + y);

	}

}
