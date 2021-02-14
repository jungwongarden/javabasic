package 생성자;

public class 게시판글틀 {
	int no;
	String title;
	
	public 게시판글틀(int no, String title) {
		this.no = no;
		this.title = title;
	}

	@Override
	public String toString() {
		return "게시판글틀 [no=" + no + ", title=" + title + "]";
	}
}
