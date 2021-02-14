package 클래스사용하기;

import java.io.IOException;

import org.jsoup.Jsoup;

public class 네이버크롤링 {

	public static void main(String[] args) throws IOException {
		// 네이버 크롤링을 해보자.
		System.out.println(Jsoup.connect("http://www.naver.com").get());
	}

}
