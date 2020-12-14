package 배열기본;
//윈도우 빌더 설치해야함.
import java.util.Random;

public class 많은양중에서특정한값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		//99가 있는지 찾아보세요!
		//99가 몇 개 있는지 찾아보세요!
		//99가 어디에 있는지 찾아보세요!
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 99) {
				//System.out.println("99를 찾음.");
				System.out.println("99의 위치: " + i);
				count++;
			}
		}
		System.out.println("개수는 " + count + "개");
	}
}
