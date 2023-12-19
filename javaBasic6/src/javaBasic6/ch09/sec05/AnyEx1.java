package javaBasic6.ch09.sec05;

public class AnyEx1 {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.bM();
		
		
		//B클래스의 자식클래스가 필요함. 왜나면 bM()재정의해서 사용하려고
		 B bb = new B() {
			 
			 int b = 20;
			 
			 @Override
			void bM() {
				System.out.println("자식메소드 + b");
			}
			
			
		};
		
		bb.bM();
		//부모클래스를 new하고 바로뒤에 { }을 써서 자식의 클래스의 내용을 써 주는 것
		
	}

}


class B {
	void bM() {
		System.out.println("부모메소드");
	}
	
}