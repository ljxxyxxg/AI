package javaBasic5.ch08.sec03;

public class Ȯ�ι���9�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A a = new A(); //��üȭ �� �� ����.
		//�������̽��� ����Ϸ��� class�� �����Ͽ��� �̿��Ѵ�.
		//������ü�� �������̽� Ÿ������ ��ȯ�Ϸ��� �ڵ����� �ٲ�� �ڽ� Ŭ�������� �θ� Ŭ������ �ڵ����� �ٲ��.
		aImpl a = new aImpl();
		Driver d = new Driver();
		d.a = new aImpl();
		d.driver(a);
		B b = new BB();// �ڵ� ����ȯ
		b.aM();
		// b.bM(); ���Ұ�
		
		
		BB bb2 = (BB) b; //���� ����ȯ
		bb2.aM();
		bb2.bM();
		
		
	
	
	
	
	
	}
	


}
class Driver{
	A a;
	void driver(A a) {
		a.aM();
	}
	
}

class B{
	int a = 10;
	void aM() {
		System.out.println( a );
	}
	
	
}

class BB extends B {
	int b = 20;
	void bM() {
		System.out.println( b );
	}
	
	
}

interface A{
	//���
	static final int a = 10;
	abstract void aM(); //�߻�޼ҵ�
	default void dM() {} //default �޼ҵ� �������̵� �� �� �ִ�.
	static void sM( ) {} //���� �޼ҵ� ��� ����
	
	
	
}

class aImpl implements A{ //����Ŭ����

	@Override
	public void aM() {
		System.out.println(a);
	}
	
	@Override
	public void dM() {
		// TODO Auto-generated method stub
		A.super.dM();
	}
	
	
	
	
	
}