package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 수퍼 = new 수퍼맨();
		수퍼.name = "클라크"; //사람
		수퍼.gender = '남'; //사람
		수퍼.power = 1000; //맨
		System.out.println(수퍼);
		
		수퍼.잠자다(); //사람
		수퍼.먹다(); //사람
		수퍼.달리다(); //맨
		수퍼.날아다니다(); //수퍼맨
		
	}

}
