package 배열심화;

public class 많은데이터최소값찾기 {

	public static void main(String[] args) {
		int[] num = {90, 80, 20, 60, 70};
		
		//해당 index까지의 최소값을 넣어두는 변수를 하나 만들자.
		int min = num[0];//90
		//0으로 초기값을 넣어주면, 최소값이 0이 되어버린다.!
		for (int i = 1; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최소값은 " + min);
		
		
		

	}

}
