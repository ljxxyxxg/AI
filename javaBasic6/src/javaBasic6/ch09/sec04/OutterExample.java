package javaBasic6.ch09.sec04;

public class OutterExample {

	public static void main(String[] args) {
		//�ۿ� Ŭ������ ���� ��üȭ �ϼ���.
		Outter o = new Outter();
		
		//iaM() �޼ҵ带 ȣ���Ϸ���
		//1. ���θ� ��üȭ�Ѵ�. 2. �޼ҵ� ȣ���Ѵ�.
		Outter.Inner i =o.new Inner();
		i.iaM();


	}

}

class Outter {
	
	int a = 10;
	void aM() {
		
	}
	static int sa = 20;
	static void saM( ) {
		
	}
	
	class Inner {
		
		int ia = 100;
		void iaM( ) {
			//����Ŭ������ �ܺ�Ŭ������ ��� ������� �� �� �� �ִ�.
			ia = ia + 20;
			a = a + 20;
			aM();
			Outter.sa= Outter.sa + 100;
			Outter.saM();
			
		
		}
		
//		static int sia = 10;
//		static void siaM( ) {
//			
			
//		}
		
		
	}
	
}