package javaBasic4.ch07.sec08;

import javaBasic4.ch07.sec07.A;

public class D extends A{
	
	public D() {
	super();	
	}
	

	public void mathod() {
		this.field = "value";// 다른 패키지에 있는 A클래스 부모의 필드 쓸 수  있디
		this.mathod();
	}
	
	
	
	
//	public void method() {
//		A a = new A();
//		a.fild = "value";
//		a.method();
//	}

}
