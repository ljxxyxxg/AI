package javaBasic6.ch09.sec01;

public class Aexample {

	public static void main(String[] args) {
		A a = new A();
		a.aM();
		A.sa = 2000;
		A.saM();
		
		A.B ab = a.new B(); //A.B A클래스에 속해 있는 B클래스
		ab.b = 300;
		ab.bM();
		
		
				
	}

}


class A {
	
	int a = 10;
	void aM() {
		System.out.println(a);
		//b = b + 100; //내부 클래스의 변수를 사용 할 수 없다.
		//bM(); 내부 클래스의 메소드를 사용할 수 없다.
		
	}
	
	static int sa = 200; //정적멤버 번역할 때 미리 스택 메모리에 올린다.
	static void saM( ) {
		System.out.println( sa );
		//System.out.println( b ); 메모리에 올라가지 못함 new를 하고 써야한다.
		//static 붙어 있는 메소드는 미리 올라가기 떄문에 new 해서 쓰는 것은 못쓴다.
		
	}
	
	
	class B{
	// a = a + 100; 메소드 속 명령 클래스에 명령 x
	// aM(에러); 메소드 속 메소드 호출 클래스에 명령 x
	int b = 20;
	void bM( ) {
		a = a + 100; //내부 클래스에서 외부 클래스 필드를 사용 할 수 있다.
		aM(); // 내부 클래스에서 외부 클래스의 메소드 호풀 할 수 있다.
		System.out.println( b );
		
	}
	
	static int sb = 200; //A클래스가 new가 되기전 이라서 주소를 가지고 올라가야지 연결가능
	static void sbM( ) {
		
	}
		
	}
	
}
