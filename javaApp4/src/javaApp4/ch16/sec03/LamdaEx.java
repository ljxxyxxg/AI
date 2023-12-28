package javaApp4.ch16.sec03;

public class LamdaEx {

	public static void main(String[] args) {
		Person person = new Person();
		//���2 �͸�����ü �ڵ�
//		 Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				Computer.staticMethod(x, y);
//				return 0;
//			}
//		};
		
		//���3 ���ٽ����� ����
//		Calcuable calcuable = (double x, double y) -> {Computer.staticMethod(x, y);	return 0;};
//		Calcuable calcuable = (x, y) -> Computer.staticMethod(x, y);
		
		//���4 �޼ҵ� ����
		//Calcuable calcuable = Computer::staticMethod;
		//�������̽�   ����     =  Ŭ������ :: Ŭ���� �ȿ� �޼ҵ��
		//�������̽��� �߻�޼ҵ�� �Է��Ͽ� Ŭ���� �ȿ� �ִ� �޼ҵ带 ����(���) ����ض�
 		//person.action( calcuable );
 		
 		
 		Computer computer = new Computer();
// 		
// 		Calcuable calcuable1 = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				return computer.istanceMethod(x, y);
//			
//			}
//		};
 		
 		//���2 ���ٽ�
// 		Calcuable calcuable1 = (double x, double y) -> {return computer.istanceMethod(x, y); };
// 		Calcuable calcuable1 = (x, y) ->computer.istanceMethod(x, y);
 		
 		//���3 �޼ҵ� ����
 		Calcuable calcuable1 = computer::istanceMethod;
 		person.action( calcuable1 );

	}

}

//@������̼� �ٷ� �Ʒ��� �ִ� ��ü�� �Ӽ��� �����ϴ°�
@FunctionalInterface 
interface Calcuable {
	double calc( double x, double y); // �߻�޼ҵ�
	
}

class Person {
	public void action( Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("��� : " +result );
	}
	
}

class Computer {
	public static double staticMethod(double x, double y) {
		return x + y;
		
		
	}
	public double istanceMethod(double x, double y) {
		return x * y;
	}
}