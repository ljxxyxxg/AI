package javaBasic4.ch07.sec15;

public class PhoneExample {

	public static void main(String[] args) {
		Play play = new Play();
		
		SmartPhone s = new SmartPhone();
		play.playing(s);
		play.stop(s);
		
		Iphone iphone = new Iphone();
		play.playing(iphone);
		play.stop(iphone);
		
		
		//Phone phone = new Phone(); //추상 클래스는 객체화 사용 X (유효하지 않음), 강제 자식 클래스를 오버라이드 시키기 위한 tool
		
		
				
		
		
	}

}
