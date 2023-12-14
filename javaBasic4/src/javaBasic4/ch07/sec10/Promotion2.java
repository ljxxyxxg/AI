package javaBasic4.ch07.sec10;

public class Promotion2 {

	public static void main(String[] args) {
		// E 객체생성합니다
		E e = new E();
		B e1 = new E();
		A e2 = new E();
		
		//G 객체를 생성합니다
		 C g1 = new G();
		 A g2 = new G();
		 	
		 //H 객체 생성합니다.
		 D h1 = new H();
		 A h2 = new H();
		 
		 
		 
		 
	}

}


class A{
	
	
}

class B extends A {
	
	
	
}

class C extends A {
	
	
	
}


class D extends A {
	
	
}

class E extends B {
	
	
	
}

class F extends B {
	
	
} 

class I extends E {
	
	
	
}

class G extends C {
	
	
	
}

class H extends D {
	
	
}














