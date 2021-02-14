package 형변환;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 참조형 변수: 주소가 들어가는 변수
		//           기본형말고 다.
		//           배열, 클래스, ArrayList, .....
		//참조형 형변환은 모든 참조형 변수에 다 쓸 수 있는 것은 아님.
		//"상속 관계"에서만 참조형 형변환 가능!!!!!
		//부모클래스를 가져다가 확장해서 만든 것이 자식클래스
		//Car              <------      Truck
		
		Truck t = new Truck();
		Car c = t; //부모클래스(수퍼, 큰) <--- 자식클래스(서버, 작)
		//자동으로 큰 Car로 변환되어 들어감.
		
		Taxi t2 = new Taxi();
		c = t2; //가능!! 큰(부모)<--작(자식), 자동형변환, 업캐스팅
		//자동으로 큰 Car로 변환되어 들어감.
		//캐스팅은 그 타입으로 던져졌다라는 의미!! 타입변환, 형변환
		//부모자리가 들어갈 수 있는 자리로 설정이 되어있으면 
		//그 자리에 자식들이 다 들어갈 수 있다.
		
//		t = t2; //형제관계는 형변환 불가능!!
		
		//자동형변환!!!
		//클래스들 중에서 제일 위에 있는 부모는? Object!!
		//어떤 자리에 Object이 들어갈 수 있다라고 설정이 되어있다면
		//이 자리에는 아무것이나 다 넣을 수 있다라는 의미!
		ArrayList list = new ArrayList();
		//list.add(Object o): o의 위치에는 Object자식들은 Object보다 
		//더 작으므로 다 들어갈 수 있음.
		//Object(큰) <--- String, Car, Taxi(작), 자동형변환, 업캐스팅
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(true);
		list.add(c);
		list.add(t);
		System.out.println(list);
		
		//자동형변환을 하는 경우에는 형변환해서 넣을 수는 있으나,
		//추가된 자식의 기능을 사용할 수는 없음.
		//좀전에 자동형변환해서 넣어놓은 String의 기능만을 사용하고자 하는 경우
		//다시 String으로 꺼내주어야함.
		String name = (String)list.get(0); //"홍길동" Object!!!
		//강제로 String으로 변환하여 꺼내주면, String의 원래 기능을 다 쓸 수 있다.
		char lastname = name.charAt(0);
		System.out.println("당신의 라스트네임은 " + lastname);
		
		
		Car c2 = (Car)list.get(4);//Car
		c2.run();
		
	}
}









