package 형변환;

public class 포장클래스 {	//랩퍼클래스

	public static void main(String[] args) {
		String data = "100";
		int data2 = Integer.parseInt(data);//포장클래스
		//기본형(정수,실수,문자,논리)데이터와 관련된 처리를 하기 위한 클래스
		
		Integer data3 = data2;//auto-boxing(포장클래스<--기본형)
							//auto-unboxing(포장클래스-->기본형)
		
	}

}
