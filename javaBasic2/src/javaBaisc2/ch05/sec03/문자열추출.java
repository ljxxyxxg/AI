package javaBaisc2.ch05.sec03;

import java.util.Scanner;

public class ���ڿ����� {

	public static void main(String[] args) {
	
		String title = "�ڹ������α׷���"; //���ڿ� ��ü
		String title2 = new String("�ڹ����α׷���");
		
		System.out.println(title2.length() ); //length : ���ڿ��� ���̸� ���ϴ°�
		System.out.println(title2.charAt(1) );//charAt(�ε�����ȣ)
		System.out.println(title2.charAt(6) );
		
		title2 = title2.replace("�ڹ�","java");
		System.out.println(title2);
		
		title2 = title2.substring(4, 8);
		System.out.println(title2);
		
		System.out.println(title.subSequence(0, 2) );//�ڹ� ���
		System.out.println(title.indexOf("��") );//"��" �ε��� ��ȣ �˱�
		System.out.println(title.indexOf("��", 4) );//�ε��� 4���ڷ� "��"�� ã�ƶ�
		
		
		String names = "�̼���,ȫ�浿,����ġ";
		String[] nameArr = names.split(",");
		
		for(int i=0; i< nameArr.length; i++) {
			System.out.println(nameArr[i] );
			
		}
		
		
		String fruits = "���-��-��-�ٳ���";
		String[] fruit = fruits.split("-");
		
		for(int i=0; i< fruit.length; i++) {
			System.out.println(fruit[i] );
			
		}
		
		//���� for��
		//���� for( Ÿ�Ժ��� : | ����) { �ݺ��� ���� }
		for(String f : fruit) {
			System.out.println( f );
		}
		
		//�����߿��� ������ �ֳ���? �����
		
		Scanner sc = new Scanner(System.in); 
			System.out.println( "���� ���� ��Ƿ���? ");
			String order = sc.nextLine();
			boolean flag = false; // ������ �ִ��� ������ üũ �ϴ� ����
			for(String f : fruit) {
				if(order.equals(f) ) {
					System.out.println("�ֽ��ϴ�.");
					flag = true;
					break;
				}
				
			}
		if( !flag) System.out.println("�����ϴ�.");
		
		int[] array;
		//array = {1, 2, 3}; �����߻�
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		
		
		
	}

}
