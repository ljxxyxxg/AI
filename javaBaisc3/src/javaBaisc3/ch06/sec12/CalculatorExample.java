package javaBaisc3.ch06.sec12;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); //1단계 객체화 한다. 힙메모리에 올린다.
		
		calculator.powerOn(); //메소드 호출 메인 안에서
		calculator.poweroff();
		
		calculator.powerOn();
		int result = calculator.plus(300, 500);
		System.out.println(result);
		
		result = calculator.plus(-50, -200);
		System.out.println(result);
		
		// 예)1.
		result = calculator.plus(100, 200);
		result = calculator.plus(result, 300);
		System.out.println(result);
		
		// 예)2. 메소드의 매개변수를 3개로 만들어 두고 
		result = calculator.plus(100, 200, 300);
		System.out.println(result);
		
		// int sum ( int ... values)  여러개
		

	}

}
