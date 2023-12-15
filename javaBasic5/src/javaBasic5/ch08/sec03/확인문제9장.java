package javaBasic5.ch08.sec03;

public class 확인문제9장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A a = new A(); //객체화 할 수 없다.
		//인터페이스르 사용하려면 class를 구현하여서 이용한다.
		//구현객체를 인터페이스 타입으로 변환하려면 자동으로 바뀐다 자식 클래스에서 부모 클래스는 자동으로 바뀐다.
		aImpl a = new aImpl();
		Driver d = new Driver();
		d.a = new aImpl();
		d.driver(a);
		B b = new BB();// 자동 형변환
		b.aM();
		// b.bM(); 사용불가
		
		
		BB bb2 = (BB) b; //강제 형변환
		bb2.aM();
		bb2.bM();
		
		
	
	
	
	
	
	}
	


}
class Driver{
	A a;
	void driver(A a) {
		a.aM();
	}
	
}

class B{
	int a = 10;
	void aM() {
		System.out.println( a );
	}
	
	
}

class BB extends B {
	int b = 20;
	void bM() {
		System.out.println( b );
	}
	
	
}

interface A{
	//상수
	static final int a = 10;
	abstract void aM(); //추상메소드
	default void dM() {} //default 메소드 오버라이드 할 수 있다.
	static void sM( ) {} //정적 메소드 사용 가능
	
	
	
}

class aImpl implements A{ //구현클래스

	@Override
	public void aM() {
		System.out.println(a);
	}
	
	@Override
	public void dM() {
		// TODO Auto-generated method stub
		A.super.dM();
	}
	
	
	
	
	
}