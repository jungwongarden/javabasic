package 인터페이스;

//인터페이스는 상속도 된다.
//클래스의 상속은 단일상속만 가능!
//인터페이스의 상속은 다중상속이 가능!
public interface MultiPhone extends Phone, Computer{
	//7개의 추상메서드
	public void picture();
}
