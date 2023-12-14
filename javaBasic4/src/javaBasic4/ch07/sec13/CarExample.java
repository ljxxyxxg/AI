package javaBasic4.ch07.sec13;

public class CarExample { //굉장히 중요한 코드

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
