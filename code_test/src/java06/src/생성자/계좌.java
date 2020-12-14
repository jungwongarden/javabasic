package 생성자;

public class 계좌 {
	String name; //이름
	String field; //종류 
	int money; //금액

	//new 계좌("홍길동", "예금", 10000);
	//new로 객체생성시 입력값을 초기화시킬 목적으로
	//클래스이름과 동일하게 만들어주는 메서드
	//생성자(메서드, constructor)
	public 계좌(String name, String field, int money) {
		this.name = name;
		this.field = field;
		this.money = money;	
	}

	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}
	
	
	
}

