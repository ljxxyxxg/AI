package javaBaisc3.ch06.sec10.exam03;

public class ClassName250 { //static 블록에서는 인스턴스 멤버들 사용 불가 메모리에 안올라가있음
							// 인스턴스 코드는 new를 사용하면 사용 가능
							// 특별한 경우만 : static
							// 상수 const : 일반적인 대 문 자 final이 붙으면 마지막 끝이다라는 뜻 : 바뀌지 않은 수를 상수로 고정
	
	
							//public 제한없음
							//protected없음
	
	
	
	
							static final int A = 100; 
							static final double PI = 3.14159;
							static final double RATE = 0.025;
	
							// 변수
							int a = 10;
	
	
	
	// 인스턴스 멤버들
	int field;
	void method() {
		a=a+100;
		System.out.println( A +20 );
		//A = 1000; 에러 발생 상수이기 떄문
	};
	
	
	// 정적 멤버들 (클래스 멤버들)
	static int field2;
	static void method2() {};
	
	
	static {
		//field = 10; 오류 // 메모리 올라가는 시점 다르다.
		//method(); 오류
		field2 = 20;
		method2();
		
	};

	
	static void method3() {
		//field = 10; 오류
		//method(); 오류
		field2 = 20;
		method2();
		
		
		
	};
	
	
	
	
	{
		
		    field = 10;  // 메모리 올라가는 시점 다르다.
		    method(); 
			field2 = 20;
			method2();
				
		
		
		
	};
	
	
	
	
	void method04() {
		field = 10;  // 메모리 올라가는 시점 다르다.
	    method(); 
		field2 = 20;
		method2();
				
		
		
	};
	
	
	
	
	
	
	
	
	
	
	
}
