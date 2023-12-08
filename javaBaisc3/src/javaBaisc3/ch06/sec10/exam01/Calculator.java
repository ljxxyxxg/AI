package javaBaisc3.ch06.sec10.exam01;

public class Calculator {
	
	//빌드 단계(클래스 로더단계) 에서 자동으로 스택영역에 올라가서 계속 있는다.
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
		
		
	};
	
	static int minus( int x, int y) {
		return x-y;
		
		
	};
	
	static int times(int x, int y) {
		return x*y;
		
	};
	
	static double div(int x, int y) {
		return x / y;
		
		
	};

	

}
