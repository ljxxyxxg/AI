package javaBasic6.ch09.sec01;

public class Aexample {

	public static void main(String[] args) {
		A a = new A();
		a.aM();
		A.sa = 2000;
		A.saM();
		
		A.B ab = a.new B(); //A.B AŬ������ ���� �ִ� BŬ����
		ab.b = 300;
		ab.bM();
		
		
				
	}

}


class A {
	
	int a = 10;
	void aM() {
		System.out.println(a);
		//b = b + 100; //���� Ŭ������ ������ ��� �� �� ����.
		//bM(); ���� Ŭ������ �޼ҵ带 ����� �� ����.
		
	}
	
	static int sa = 200; //������� ������ �� �̸� ���� �޸𸮿� �ø���.
	static void saM( ) {
		System.out.println( sa );
		//System.out.println( b ); �޸𸮿� �ö��� ���� new�� �ϰ� ����Ѵ�.
		//static �پ� �ִ� �޼ҵ�� �̸� �ö󰡱� ������ new �ؼ� ���� ���� ������.
		
	}
	
	
	class B{
	// a = a + 100; �޼ҵ� �� ��� Ŭ������ ��� x
	// aM(����); �޼ҵ� �� �޼ҵ� ȣ�� Ŭ������ ��� x
	int b = 20;
	void bM( ) {
		a = a + 100; //���� Ŭ�������� �ܺ� Ŭ���� �ʵ带 ��� �� �� �ִ�.
		aM(); // ���� Ŭ�������� �ܺ� Ŭ������ �޼ҵ� ȣǮ �� �� �ִ�.
		System.out.println( b );
		
	}
	
	static int sb = 200; //AŬ������ new�� �Ǳ��� �̶� �ּҸ� ������ �ö󰡾��� ���ᰡ��
	static void sbM( ) {
		
	}
		
	}
	
}
