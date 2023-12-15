package javaBasic6.ch09.sec03;

public class localExample {

	public static void main(String[] args) {
		
		localExample le = new localExample();
		le.localM();
		
		
	}
	
	public void localM() {
		int a = 10;
		
		class AAA{
			int sa = 100;
			void m( ) {
				System.out.println(" 메소드 안에 있는 클래스의 메소드");
			}
		}; ///end AAA끝
		
		AAA aaa = new AAA(); //객체 생성
		aaa.m();//사용하기
		
		
		
	}
	
	

}
