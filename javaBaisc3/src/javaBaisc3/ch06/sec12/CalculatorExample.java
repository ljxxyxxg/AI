package javaBaisc3.ch06.sec12;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); //1�ܰ� ��üȭ �Ѵ�. ���޸𸮿� �ø���.
		
		calculator.powerOn(); //�޼ҵ� ȣ�� ���� �ȿ���
		calculator.poweroff();
		
		calculator.powerOn();
		int result = calculator.plus(300, 500);
		System.out.println(result);
		
		result = calculator.plus(-50, -200);
		System.out.println(result);
		
		// ��)1.
		result = calculator.plus(100, 200);
		result = calculator.plus(result, 300);
		System.out.println(result);
		
		// ��)2. �޼ҵ��� �Ű������� 3���� ����� �ΰ� 
		result = calculator.plus(100, 200, 300);
		System.out.println(result);
		
		// int sum ( int ... values)  ������
		

	}

}
