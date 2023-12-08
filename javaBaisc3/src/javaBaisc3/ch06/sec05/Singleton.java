package javaBaisc3.ch06.sec05;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		//생성자 new 하면 실행되는데 private 해서
		// 외부 클래스에서 new 못하게 함
		
		
		//Calendar 클래스 달력 자료 넣는 클래스
		//객체화
		// public 메소드 주소 넣어줌
		//A클래스 달력 사용 객체화 못함
		//B클래스 달력 사용 객체화 못함
		//C클래스 달력 사용 객체화 못함
		
		
		
	};
	
	
	public static Singleton getInstance() {
		return singleton;
		
		//스스로 객체를 생성해서 주소르 변수에 담고 메소드를 통해서 주소 변수만 보내주는것
		
		
		
	};
	
	

}
