package javaBasic5.ch08.sec04;

public class 확인문제9장5번 {

	public static void printSound(Soundable soundable) {
		System.out.println( soundable.sound() );
		
		

	};
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
		
		printSound ( new Cat() );
		printSound ( new Dog() );
		
		
	}

}

interface Soundable {
	public String sound();
	
};

class Cat implements Soundable {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}
	
};


class Dog implements Soundable {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "멍멍";
	}
	
	
};
















interface Remocon {
	public void powerOn(); //추상메소드
};

class TV implements Remocon {//Remocon 구현 클래스

	@Override
	public void powerOn() {
		System.out.println("티비를 켰습니다.");
	} 
	

};
