package javaBaisc3.ch06.sec03;

import javaBaisc3.ch06.sec04.AA;

public class ���������� {

	public static void main(String[] args) {
		
		A aAdd = new A(); //��üȭ �ϱ�
		
		//System.out.println(aAdd.a); private �ٸ� ��ü���� ����
		
		System.out.println(aAdd.b); //default ���� ��Ű�� ����
		
		System.out.println(aAdd.c); //public ����
		
		
		//aAdd.a1(); private �ٸ���ü���� ����
		aAdd.b1();
		aAdd.c1();

		
		AA aaAdd = new AA();
		// ����System.out.println( aaAdd.a ); private �ٸ���ü���� ����
		// System.out.println( aaAdd.b); default  ���� ��Ű���� ����
		System.out.println(aaAdd.c); //���������ڰ� public�̴ϱ� �����ϴ�
		
		
		/*aaAdd.a1();
		aaAdd.b1();*/
		
		aaAdd.c1();
		
		//���� ���߽� ������ private �޼ҵ� public���� ����
		
		
		
	}

}
