package javaBasic4.ch07.sec11;

public class Promotion3Ex {

	public static void main(String[] args) {
		A a = new A();
		a.eat();
		
		System.out.println();
		A b = new B();
		b.eat(); // 떡볶이 자식자료
		
		B b1 = new B();
		b1.eat();// 떡볶이 자식자료
		//떡볶이 자식자료 부모타입 변수 선언해도 자식자료 나온다(중요)
		
		System.out.println();
		A bb = new BB();
		bb.eat();
		
		BB bb1 = new BB();
		bb1.eat(); // 부모타입 변수로 선언해도 자식의 자료인 햄버거 출력
		
		C c = new C();
		B c1 = new C();
		A c2 = new C();
		c.eat();
		c1.eat();
		c2.eat();
		
		
		
	}

}


class A {
	void eat() {
		System.out.println("밥");
		
	}
}

class B extends A {
	
	@Override
	void eat() {
		System.out.println("떡볶이");
	}
}

class BB extends A {
	@Override
	void eat() {
		System.out.println("햄버거");
	}
	
}

class C extends B {
	@Override
	void eat() {
		System.out.println("피자");
	}
}