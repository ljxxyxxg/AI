package javaApp1.ch12.sec04;

import java.util.Calendar;

public class CalendarExamle {

	public static void main(String[] args) {
		//�̱��� ����
		Calendar now = Calendar.getInstance(); //�޷��� ����� �� �ִ� �޼ҵ�
		int a1 = now.get(Calendar.YEAR); //�����
		int a2 = now.get(1); //�����
		System.out.println( a1 + " " + a2 );
		int a3 = now.get(Calendar.MONTH); //����� ���� 0�� ~ 11��
		int a4 = now.get(2) +1; // �����
		System.out.println(a3 + " " + a4);
		
		int a5 = now.get(Calendar.DAY_OF_MONTH); //����� ���� 0�� ~ 11��
		int a6 = now.get(5);  // �����
		System.out.println(a5 + " " + a6);
		
		int a7 = now.get(Calendar.DAY_OF_WEEK); //����� ���� 0�� ~ 11��
		int a8 = now.get(7); // �����
		System.out.println(a7 + " " + a8);
		
		int a9 = now.get(Calendar.AM); //����� ���� 0�� ~ 11��
		int a10 = now.get(1); // �����
		System.out.println(a9 + " " + a10);
		
		int a11 = now.get(Calendar.AM_PM); //����� ���� 0�� ~ 11��
		int a12 = now.get(9); // �����
		System.out.println(a11 + " " + a12);
		
		if( a9 == Calendar.AM) {
			System.out.println("����");
			
		} else {
			System.out.println("����");
		}
	
		int a13 = now.get(Calendar.HOUR); //����� ���� 0�� ~ 11��
		int a14= now.get(5) ; // �����
		System.out.println(a13 + " " + a14);
		
		int a15 = now.get(Calendar.MILLISECOND); //����� ���� 0�� ~ 11��
		int a16 = now.get(5) ; // �����
		System.out.println(a15 + " " + a16);
		
		
		int a17 = now.get(Calendar.SECOND); //����� ���� 0�� ~ 11��
		int a18 = now.get(5); // �����
		System.out.println(a17 + " " + a18);
		
		
		//2023�� 12�� 20�� 11�� 53��
		System.out.println(now.get(Calendar.YEAR)+ "��" + (now.get(Calendar.MONTH)) + "��" + now.get(Calendar.DAY_OF_MONTH) + "��" + now.get(Calendar.HOUR) + "��");
		
		
	}

}
