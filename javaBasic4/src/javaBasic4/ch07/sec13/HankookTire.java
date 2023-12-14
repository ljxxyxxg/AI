package javaBasic4.ch07.sec13;



//자식클래스 = 하위 클래스 = 세부내용(한국타이어, mySql)
public class HankookTire extends Tire {
	
@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
		System.out.println("MySQL 프로그램으로 데이터베이스 연결합니다.");
	}

}
