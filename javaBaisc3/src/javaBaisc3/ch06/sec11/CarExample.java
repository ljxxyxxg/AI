package javaBaisc3.ch06.sec11;

public class CarExample {

	public static void main(String[] args) {
		// Car 클래스 객체화
	Car myCar = new Car();
	
	System.out.println("회사명: " + myCar.model);
	System.out.println("시동여부: " + myCar.start);
	System.out.println("현재속도: " + myCar.speed);
	
	//필드값 변경
	myCar.speed = 60;
	System.out.println("수정된 속도: " + myCar.speed );
	
	//생성자로 필드에 값 넣기
	Car sCar = new Car("삼성자동차", "sm3", "흰색", 370, 0);
	System.out.println("모델명");
	

	System.out.println("회사명: " + sCar.company);
	System.out.println("모델병: " + sCar.model);
	System.out.println("현재속도: " + sCar.speed);	
	
	//필드 변경 
	sCar.speed = 100;
	System.out.println("삼성 자동차 수정된 속도: " + sCar.speed);
	
	
	Car car3 = new Car();
	car3.setCompany("독일자동차");
	car3.setModel("BMW");
	car3.setMaxSpeed(300);
	car3.setcolor("검정색");
	car3.setSpeed(0);
	
	System.out.println("회사명: " + car3.getcompany());
	System.out.println("모델병: " + car3.getModel(0));
	System.out.println("색깔: " + car3.getColor(0));	
	System.out.println("모델병: " + car3.getMaxSpeed(0));
	System.out.println("현재속도: " + car3.getSpeed());	
	
	
		

	}

}
