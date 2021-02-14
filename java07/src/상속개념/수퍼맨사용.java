package 상속개념;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 sMan = new 수퍼맨();
		sMan.age = 300; //사람
		sMan.name = "클라크"; //사람
		sMan.power = 1000; //맨
		
		sMan.먹다(); //사람
		sMan.달리다(); //맨
		sMan.날다();	//수퍼맨

	}

}
