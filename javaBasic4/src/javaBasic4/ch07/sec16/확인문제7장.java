package javaBasic4.ch07.sec16;

public class Ȯ�ι���7�� {
	
	public static void action(A a) {
		a.method1();
		if(a instanceof C) { // C ��ü�� ����
			((C) a).method2(); //�θ�Ÿ�Կ��� �ڽ�Ÿ������ �ٿ� casting               
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainMainActivity m = new MainMainActivity();	
		
				m.onCreate();
				
				
				
				action(new A());
				action(new B());
				action(new C());
	}

}
