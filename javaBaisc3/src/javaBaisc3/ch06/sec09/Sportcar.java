package javaBaisc3.ch06.sec09;

public class Sportcar {
	//필드 = 항목 = 변수
	int a;
	
	//메소드 = 함수 = 동작하는 것
	void aPrint() {
		
		System.out.println(a);
		
	}
	//생성자 = 클래스명과 동일
	//기본 생성자 객체화 할때 초기값을 넣을 때 이용
	//생성자를 하나라도 안만들면 자바가 기본 생성자를 자동으로 만들어 준다.
	//만약 1개라도 만들 시 자바가 생성 x
	public Sportcar() {
		
	}
	
	public Sportcar(int a) {
		this.a = a;
		
	}
	

}
