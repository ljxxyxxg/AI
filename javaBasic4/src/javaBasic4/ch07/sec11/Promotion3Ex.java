package javaBasic4.ch07.sec11;

public class Promotion3Ex {

	public static void main(String[] args) {
		A a = new A();
		a.eat();
		
		System.out.println();
		A b = new B();
		b.eat(); // ������ �ڽ��ڷ�
		
		B b1 = new B();
		b1.eat();// ������ �ڽ��ڷ�
		//������ �ڽ��ڷ� �θ�Ÿ�� ���� �����ص� �ڽ��ڷ� ���´�(�߿�)
		
		System.out.println();
		A bb = new BB();
		bb.eat();
		
		BB bb1 = new BB();
		bb1.eat(); // �θ�Ÿ�� ������ �����ص� �ڽ��� �ڷ��� �ܹ��� ���
		
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
		System.out.println("��");
		
	}
}

class B extends A {
	
	@Override
	void eat() {
		System.out.println("������");
	}
}

class BB extends A {
	@Override
	void eat() {
		System.out.println("�ܹ���");
	}
	
}

class C extends B {
	@Override
	void eat() {
		System.out.println("����");
	}
}