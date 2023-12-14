package javaBasic5.ch08.sec02;

public class SmartPhone implements RemoteControl {
	
private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("����Ʈ���� �մϴ�.");
		
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
			
		System.out.println("���� ����Ʈ������:"  + this.volume );
		
	}


	@Override
	public void turnoff() {
		System.out.println("����Ʈ���� ���ϴ�.");
		
		
		
	}
	

}
