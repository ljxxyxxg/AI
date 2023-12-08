package javaBaisc3.ch06.sec05;

public class 생성자연습 {

	String name;
	int score;
	
	
	public 생성자연습(String string) {
		this.name = name;
	}

	public 생성자연습() {
		
		this(5,false);//다른 생성자 호출 단, 첫줄에서만 쓴다
		name = "김유신";
	}

	public 생성자연습(int i, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public 생성자연습(boolean b, int i) {
		// TODO Auto-generated constructor stub
	}

	
	
}
