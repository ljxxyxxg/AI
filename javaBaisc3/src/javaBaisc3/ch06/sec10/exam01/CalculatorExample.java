package javaBaisc3.ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5); //메소드 호풀
		int result3 = Calculator.minus(10,5);
		int result4 = Calculator.times(10,5);
		double result5 = Calculator.div(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);	
		System.out.println(result4);
		System.out.println(result5);
		
		
		
	}

}
