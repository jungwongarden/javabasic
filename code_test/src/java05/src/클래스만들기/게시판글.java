package 클래스만들기;

public class 게시판글 {
	//멤버변수=> 전역변수(global)
	public int no; //선언! 선언의 위치가 사용할 수 있는 범위!
	public String title;
	public String content;
	public String writer;
	
	//멤버메서드
	public void 글쓰다() {
		System.out.println(no + "번 글을 쓰다.");
	}
	
	public void 글수정하다() {
		System.out.println(no + "번 글을 " + content + "로 수정하다.");
		
	}
	public void 글삭제하다() {
		System.out.println(no + "번 글을 삭제하다.");
	}

	@Override //원래 있던 메서드인데, 기능을 내가 덮어씀.오버라이드
	public String toString() {
		return "게시판글 [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
