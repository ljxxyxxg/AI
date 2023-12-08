package javaBaisc3.ch06.sec02;

public class 변수의생명주기 { //생성된 곳을 벗어나면 사용 불가능한 변수가 된다.

	
	
	int c = 10; //c라는 변수는 class라는 블록 속에서 생성 (전역 변수)
	
	public static void main(String[] args) {
		
		int a = 10; //변스 선어 : 변수 생성 // 지역 변수
		//System.out.println(c);
		
		for( int i = 0; i<10; i++) { //for문에서만 사용가능
			System.out.println(i);
			
		};
			//System.out.println(i);
		

	};
	
	void method01() {
		
		int b = 20; // 지역 변수
		//System.out.println( a ); // 변수가 선언되지 않았다. 
								 // 에러발생 : 생성된 블럭 속에서만 적용
		//System.out.println(c);
		
	};
	
	void method02() {
		
		//System.out.println( b ); // b라는 변수는 두번째 블럭에서만 사용 가능
		
		//System.out.println(c);
		
	};

	

}
