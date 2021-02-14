package 상속응용스레드;

public class 별쓰레드 extends Thread {
	//이미 변수, 메서드를 가짐.
	//Thread 클래스가 가지고 있는 메서드 중에서 
	//동시에 처리하고 싶은 내용을 넣어주는 run()메서드가 있음.
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용이  run메서드 안에다가 넣어주세요.!
		for (int i = 0; i < 5000; i++) {
			System.out.println("*");
		}
	}
	
}
