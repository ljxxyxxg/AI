package javaBasic4.ch07.sec04;

public class AirPlaneExample {

	public static void main(String[] args) {
		SupersonicAirPlane sa= new SupersonicAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirPlane.NOMAL;
		sa.fly();
		sa.flyMode = SupersonicAirPlane.ROUND;
		sa.fly(); //����Ⱑ ȸ���մϴ�
		sa.flyMode = SupersonicAirPlane.SLOW;
		sa.fly(); //����Ⱑ ȸ���մϴ�
		sa.land();

	}

}
