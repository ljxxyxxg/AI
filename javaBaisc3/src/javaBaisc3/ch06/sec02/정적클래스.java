package javaBaisc3.ch06.sec02;

public class ����Ŭ���� {
	
	
	static int st = 10; 
	int it = 100;
	
	
	
	public static void main(String[] args) { //static�� �پ� �ִ� ����, �޼ҵ�
		// TODO Auto-generated method stub 	//-->����
											//--> ���α׷� ó�� ���� : ��޾�� ---> ����Ʈ �ڵ� ---> ����
											//---> Hello.java --> hello.class				Hello.exe
											// build = ����(2����) �ܰ�  + ��ũ�ܰ� + �δ��ܰ�
											//		   �ڹٹ��� �´��� üũ			�����Ҷ� ����			
											//									static �پ��ִ� ��� : new�� ���� �ʾƵ� stack �޸𸮿� ���� �ø�
											//									static �ڵ�� ���α׷� ����ñ��� ��� ����(���� �ܰ迡�� �ڵ����� stack�� �ø�)
											//static �پ� �ִ� ���� , �޼ҵ� ���� �ܰ迡�� �ڹٰ� �ٷ� ���� ������ �ڵ����� ���ε� ���α׷� ����� �ڵ� �Ҹ�
											// ������ : �����̳� �� �޸𸮿� �ö󰡾� ��� ����
		
											//
		
											
		//m1(); //m1�޼ҵ� ȣ��
		
		����Ŭ���� i1 = new ����Ŭ����(); // static �Ⱥپ� �ִ� ����� ���޸𸮿� �ö󰣴�. �ּ� i1
		i1.m2(); //�ּҸ� ���� m2 ����
		
		System.out.println( st );
		System.out.println( i1.it );
		m1( i1);
		
		
		}
		
	static void m1(����Ŭ���� i1) { // �ڹٰ� ���� �ܰ迡�� �������� ���ø޸𸮿� �÷� ��
		
		System.out.println("���� �޼ҵ��Դϴ�.");
		System.out.println( st );
		System.out.println( i1.it );
		
		};
	
	void m2() { // ���踸 �� ����
		
		System.out.println("�ν��Ͻ� �޼ҵ��Դϴ�.");
		System.out.println( st );
		System.out.println(it);
		
	};
}
