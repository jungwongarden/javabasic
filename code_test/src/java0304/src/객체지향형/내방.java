package 객체지향형;

public class 내방 {

	public static void main(String[] args) {
		
		//. => 접근연산자(기호)
		휴대폰 phone1 = new 휴대폰();
		phone1.color = "금";
		phone1.전화하다();
		
		휴대폰 phone2 = new 휴대폰();
		phone2.인터넷하다();
		
		
		강아지 dog1 = new 강아지();
		dog1.color = "황토색";
		dog1.name = "메리";
		
		dog1.꼬리를흔들다();
		System.out.println(dog1.color);
		System.out.println(dog1.name);
		
		강아지 dog2 = new 강아지();
		dog2.color = "흰색";
		dog2.name = "보리";
		dog2.짖다();
		System.out.println(dog2.color);
		System.out.println(dog2.name);
		
		
		
		
		
		
		
		
		
		
	}

}
