package javaBaisc3.ch06.sec10.exam03;

public class ClassName250 { //static ��Ͽ����� �ν��Ͻ� ����� ��� �Ұ� �޸𸮿� �ȿö�����
							// �ν��Ͻ� �ڵ�� new�� ����ϸ� ��� ����
							// Ư���� ��츸 : static
							// ��� const : �Ϲ����� �� �� �� final�� ������ ������ ���̴ٶ�� �� : �ٲ��� ���� ���� ����� ����
	
	
							//public ���Ѿ���
							//protected����
	
	
	
	
							static final int A = 100; 
							static final double PI = 3.14159;
							static final double RATE = 0.025;
	
							// ����
							int a = 10;
	
	
	
	// �ν��Ͻ� �����
	int field;
	void method() {
		a=a+100;
		System.out.println( A +20 );
		//A = 1000; ���� �߻� ����̱� ����
	};
	
	
	// ���� ����� (Ŭ���� �����)
	static int field2;
	static void method2() {};
	
	
	static {
		//field = 10; ���� // �޸� �ö󰡴� ���� �ٸ���.
		//method(); ����
		field2 = 20;
		method2();
		
	};

	
	static void method3() {
		//field = 10; ����
		//method(); ����
		field2 = 20;
		method2();
		
		
		
	};
	
	
	
	
	{
		
		    field = 10;  // �޸� �ö󰡴� ���� �ٸ���.
		    method(); 
			field2 = 20;
			method2();
				
		
		
		
	};
	
	
	
	
	void method04() {
		field = 10;  // �޸� �ö󰡴� ���� �ٸ���.
	    method(); 
		field2 = 20;
		method2();
				
		
		
	};
	
	
	
	
	
	
	
	
	
	
	
}
