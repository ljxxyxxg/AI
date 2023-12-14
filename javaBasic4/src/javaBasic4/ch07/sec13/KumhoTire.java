package javaBasic4.ch07.sec13;

//자식 클래스 = 하위 클래스 = 세부내용
public class KumhoTire extends Tire {
	@Override
	public void roll() {
		System.out.println("금호타이어가 회전합니다.");
		System.out.println("몽고 데이터베이스를 연결합니다.");
	}

}
