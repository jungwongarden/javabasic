package 정적;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public void one() { //카카오 전용 크롤링
			//1. 사이트 연결
			Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=035720");
			//2. 파일을 가지고 온다.
			try {
				Document file = con.get();
				Elements list1 = file.select("span.code");
				System.out.println("코드: " + list1.get(0).text());
				String code = list1.get(0).text();

				Elements list2 = file.select("span.blind");
				//System.out.println(list2);
				String end = list2.get(12).text();
				System.out.println("종가: " + end);
				String high = list2.get(16).text();
				System.out.println("최고가: " + high);
				String start = list2.get(19).text();
				System.out.println("시작가: " + start);

				//파일을 만들어서 내용을 쓸 수 있는 class
				FileWriter file2 = new FileWriter("카카오단독파일");
				file2.write(code + "\n");
				file2.write(end + "\n");
				file2.write(high + "\n");
				file2.write(start + "\n");
				file2.close();

			} catch (IOException e) {
				e.printStackTrace();
			} 
	}

	
	public void crawl() {
		String[] name = {"카카오", "삼성전자", "SK텔레콤","SK하이닉스", "네이버"};
		String[] company = {"035720", "005930", "017670", "000660", "035420"};
		for (int i = 0; i < company.length; i++) {
			//1. 사이트 연결
			Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + company[i]);
			//2. 파일을 가지고 온다.
			try {
				Document file = con.get();
				Elements list1 = file.select("span.code");
				System.out.println("코드: " + list1.get(0).text());
				String code = list1.get(0).text();

				Elements list2 = file.select("span.blind");
				//System.out.println(list2);
				String end = list2.get(12).text();
				System.out.println("종가: " + end);
				String high = list2.get(16).text();
				System.out.println("최고가: " + high);
				String start = list2.get(19).text();
				System.out.println("시작가: " + start);

				//파일을 만들어서 내용을 쓸 수 있는 class
				FileWriter file2 = new FileWriter(name[i]);
				file2.write(code + "\n");
				file2.write(end + "\n");
				file2.write(high + "\n");
				file2.write(start + "\n");
				file2.close();

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		

	}

}
