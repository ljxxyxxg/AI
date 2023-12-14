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
			System.out.println("초음속 비행합니다");
			}
		else if(flyMode == SUPERSONIC) {
			System.out.println("일반비행합니다.");
		}else if(flyMode == SUPERSONIC) {
			System.out.println("회전비행합니다.");
		}else if(flyMode == SUPERSONIC) {
			System.out.println("천천히비행합니다.");
		} else {
		
			super.fly();
		
		
		
		}
				
			
		}
		
	
	
	
	
			
		
	
	
	
	

}
