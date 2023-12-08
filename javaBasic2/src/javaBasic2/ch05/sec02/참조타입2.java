package javaBasic2.ch05.sec02;

public class 참조타입2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A클래스를 힙메모리에 올리세요 참조변수 aAddr
		A aAddr = new A(); // 5번라 가정
	
		//홍길동 입력
		aAddr.name = "홍길동";
		aAddr.kor = 100;
		//5번지 주소안에 있는 국어라는 주소에 100점입력
		aAddr.avg = 3.5;
	
		A aAddr2 = new A();
		//new를 반복할시 두번 생성
		
		System.out.println( aAddr == aAddr2 ); //결과값 false 10번지라 가정 
		
		
		A aAddr3 = aAddr2; //10번지를 aAddr3이라는 변수에 넣어라
		System.out.println( aAddr3 == aAddr2 );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
