package javaBasic4.ch07.sec01;

public class SmartPhone extends Phone{
	
	public boolean wifi;

	public SmartPhone(String model, String color) {
		this.model = model; //부모 필드안에 넣는다.
		this.color = color; //
		
	}
	
	protected  SmartPhone() {
		
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷을 연결합니다.");
	}
	
	

}
