package javaBasic4.ch07.sec04;

public class SupersonicAirPlane extends AirPlane{
	
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	public static final int ROUND = 3;
	public static final int SLOW = 4;
	
	
	
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�");
			}
		else if(flyMode == SUPERSONIC) {
			System.out.println("�Ϲݺ����մϴ�.");
		}else if(flyMode == SUPERSONIC) {
			System.out.println("ȸ�������մϴ�.");
		}else if(flyMode == SUPERSONIC) {
			System.out.println("õõ�������մϴ�.");
		} else {
		
			super.fly();
		
		
		
		}
				
			
		}
		
	
	
	
	
			
		
	
	
	
	

}
