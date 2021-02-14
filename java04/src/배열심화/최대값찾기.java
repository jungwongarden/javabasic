package 배열심화;

public class 최대값찾기 {

	public static void main(String[] args) {
		int[] jumsu = {11, 55, 77, 22, 33};
		//배열을 순서대로 하나씩 이동하면서 최대값을 찾아야 한다.
		//for문 필요
		//인덱스를 늘려가면서 각 인덱스의 값을 최대값을 넣어놓은 변수와
		//비교함. 만약 배열의 인덱스의 값이 최대값변수보다 크다고 한다면
		//인덱스의 값을 최대값 변수에 넣으면 됨.
		int max = jumsu[0]; //11
		for (int i = 0; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		System.out.println("최대값은 " + max);
		
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] == max) {
				System.out.println("최대값 위치는 " + i);
			}
		}
	}

}
