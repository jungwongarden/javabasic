package 정적;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		//1. 사이트 연결
		Connection con = Jsoup.connect("http://www.naver.com");
		
		//2. 파일을 가지고 온다.
		try {
			Document file = con.get();
			//System.out.println(file);
			Elements list1 = file.select("a.nav");
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
