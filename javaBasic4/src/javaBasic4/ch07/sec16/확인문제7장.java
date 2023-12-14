package javaBasic4.ch07.sec16;

public class 확인문제7장 {
	
	public static void action(A a) {
		a.method1();
		if(a instanceof C) { // C 객체일 때만
			((C) a).method2(); //부모타입에서 자식타입으로 다운 casting               
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
