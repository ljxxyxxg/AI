package javaBasic5.ch08.sec02;

public class SmartPhone implements RemoteControl {
	
private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
		
	}
	
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		} else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		} else { 
			this.volume = volume;
		}
			
		System.out.println("현재 스마트폰볼륨:"  + this.volume );
		
	}


	@Override
	public void turnoff() {
		System.out.println("스마트폰을 껍니다.");
		
		
		
	}
	

}
