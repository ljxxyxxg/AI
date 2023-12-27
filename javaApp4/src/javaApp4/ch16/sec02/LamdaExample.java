package javaApp4.ch16.sec02;

public class LamdaExample {

	private static int[] scores = {10, 50, 3};
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for( int score : scores) {
			result = operator.apply(result, score); //(10, 10)
		}
		return result;
	}
	public static void main(String[] args) {
		//�ִ밪 ��� �� 50
		int max = maxOrMin( (x, y) ->(x > y) ? x:y);
		System.out.println("�ִ� : " + max); //max���� 50
	
		int min = maxOrMin( (x,y)-> (x < y) ? x:y );
		System.out.println("�ּҰ�:" + min);
	}

}

//�Լ��� �������̽� �������̽��� �߻�޼ҵ� 1���� �� 
@FunctionalInterface
interface Operator {
	public int apply( int x, int y );
	
}
