package javaBaisc3.ch06.sec02;

public class 정적클래스 {
	
	
	static int st = 10; 
	int it = 100;
	
	
	
	public static void main(String[] args) { //static이 붙어 있는 변수, 메소드
		// TODO Auto-generated method stub 	//-->정적
											//--> 프로그램 처리 순서 : 고급언어 ---> 바이트 코드 ---> 실행
											//---> Hello.java --> hello.class				Hello.exe
											// build = 번역(2진수) 단계  + 링크단계 + 로더단계
											//		   자바문법 맞는지 체크			실행할때 에러			
											//									static 붙어있는 멤버 : new를 하지 않아도 stack 메모리에 먼저 올림
											//									static 코드는 프로그램 종료시까지 사용 가능(빌드 단계에서 자동으로 stack에 올림)
											//static 붙어 있는 변수 , 메소드 빌드 단계에서 자바가 바로 스택 공간에 자동으로 업로드 프로그램 종료시 자동 소멸
											// 사용기준 : 스택이나 힙 메모리에 올라가야 사용 가능
		
											//
		
											
		//m1(); //m1메소드 호출
		
		정적클래스 i1 = new 정적클래스(); // static 안붙어 있는 멤버들 힙메모리에 올라간다. 주소 i1
		i1.m2(); //주소를 통해 m2 접근
		
		System.out.println( st );
		System.out.println( i1.it );
		m1( i1);
		
		
		}
		
	static void m1(정적클래스 i1) { // 자바가 빌드 단계에서 자종으로 스택메모리에 올려 둠
		
		System.out.println("정적 메소드입니다.");
		System.out.println( st );
		System.out.println( i1.it );
		
		};
	
	void m2() { // 설계만 한 상태
		
		System.out.println("인스턴스 메소드입니다.");
		System.out.println( st );
		System.out.println(it);
		
	};
}
