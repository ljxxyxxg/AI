package javaBasic7.ch11.sec02.exam01;

public class ExceptionEx3 {

	public static void main(String[] args) {
	try {	
		B b = new B();
		b.b1();

	}catch(ArithmeticException e) {
		System.out.println("분모가 0 오류");
	} finally {
		System.out.println("DB담기");
		System.out.println("로그오프");
	}
	
	
	
	}
	

}

class B {
	void b1() throws ArithmeticException{
		b2();
		
	}
	void b2() throws ArithmeticException {
		int a = 10;
		a = a / 0;
	
	}
	

}