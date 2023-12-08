package javaBaisc3.ch06.sec01;

import java.util.Date;

public class 대출현황표 {
	
	
	//멤버 필드
	String 대출번호;
	String 성명;
	Date 대출일;
	String 대출종류;
	int 대출금액;
	int 기간;
	
	
	//생성자  //클래스 설계도 작업
	//객체화(인스턴스화) : new 명령으로 힙메모리에 올리고 실제 값 넣기 
	// - new 명령어는 main() 있는 곳에서
	public 대출현황표() {
		super();
	}


	public 대출현황표(String 대출번호, String 성명, Date 대출일, String 대출종류, int 대출금액, int 기간) {
		super();
		this.대출번호 = 대출번호;
		this.성명 = 성명;
		this.대출일 = 대출일;
		this.대출종류 = 대출종류;
		this.대출금액 = 대출금액;
		this.기간 = 기간;
	
	
	}


	public String get대출번호() {
		return 대출번호;
	}


	public void set대출번호(String 대출번호) {
		this.대출번호 = 대출번호;
	}


	public String get성명() {
		return 성명;
	}


	public void set성명(String 성명) {
		this.성명 = 성명;
	}


	public Date get대출일() {
		return 대출일;
	}


	public void set대출일(Date 대출일) {
		this.대출일 = 대출일;
	}


	public String get대출종류() {
		return 대출종류;
	}


	public void set대출종류(String 대출종류) {
		this.대출종류 = 대출종류;
	}


	public int get대출금액() {
		return 대출금액;
	}


	public void set대출금액(int 대출금액) {
		this.대출금액 = 대출금액;
	}


	public int get기간() {
		return 기간;
	}


	public void set기간(int 기간) {
		this.기간 = 기간;
	}
	
	
	
	
	

}
