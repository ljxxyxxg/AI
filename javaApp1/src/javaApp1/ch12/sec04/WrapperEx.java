package javaApp1.ch12.sec04;

public class WrapperEx {

	public static void main(String[] args) {
		// �ڷ��� �⺻�� byte char int long boolean, float double ������ Ÿ��: String Ŭ������ ����
		// �⺻���� Ŭ������ �ƴϹǷ� �̸� ������� �޼ҵ尡 ���� �׷��� �⺻�� �ڷ����� Ŭ���� ����� �а� �ִ�. Wrapper(����) Ŭ����
		// �ڽ� �⺻�� ---> ��ü, ��ڽ� ��ü --> �⺻��
		
		
		Integer a = 10;
		Integer a1 = new Integer(10);
		String as = a.toString(); //10 --> "10"����
		
		
		double da = a.doubleValue();
		System.out.println(da);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE); 
		System.out.println( a.SIZE);
		
		
		//3.14
		Double b = 3.14;
		Double b1 = new Double(3.14);
		String bs = b.toString();
		
		System.out.println(b.MAX_VALUE);
		System.out.println(b.SIZE);
		
		
		System.out.println( b.max(10.1, 5.4) );
		
	}

}
