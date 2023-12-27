package javaApp3.ch13.sec01;

public class GenericExample {
	//���ѵ� Ÿ�� �Ķ���͸� ���� ���׸� �޼ҵ�
	public static <T extends Number> boolean compare(T t1, T t2 ) {
		//T�� Ÿ�� ���
		System.out.println("compare(" + t1.getClass().getSimpleName() + "," +t2.getClass().getSimpleName() + ")");
		//Number�� �޼ҵ� ���
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1 == v2);
		
		
		
	}
	
	public static void main(String[] args) {
		//���׸� �޼ҵ� ȣ��
		boolean result1 = compare(10,20);
		System.out.println(result1);
		System.out.println();
		
		
		//���׸� �޼ҵ� ȣ��
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		System.out.println();
		
		boolean result3 = compare(4.5f, 4.5f);//float�� 4.5f
		System.out.println(result3);
		System.out.println();
		
		boolean result4 = compare(500L, 100L);//long�� ������ 8����Ʈ
		System.out.println(result4);
		System.out.println();
		
//		boolean result5 = compare("a", "b"); //Ÿ�Կ��� Number�� �ڽĸ� ����(�������� Number��ü�� �ƴ϶� ����)
//		System.out.println(result5);
//		System.out.println();
	}
		
		
}

