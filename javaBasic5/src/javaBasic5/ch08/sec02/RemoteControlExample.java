package javaBasic5.ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		new Television();
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnoff();
		
		rc = new SmartPhone();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnoff();
		
		rc.defaultM();
		RemoteControl.staticM();
				
	}

}
