package javaBasic4.ch07.sec08;

import javaBasic4.ch07.sec07.A;

public class D extends A{
	
	public D() {
	super();	
	}
	

	public void mathod() {
		this.field = "value";// �ٸ� ��Ű���� �ִ� AŬ���� �θ��� �ʵ� �� ��  �ֵ�
		this.mathod();
	}
	
	
	
	
//	public void method() {
//		A a = new A();
//		a.fild = "value";
//		a.method();
//	}

}
