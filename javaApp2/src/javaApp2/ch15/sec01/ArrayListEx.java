package javaApp2.ch15.sec01;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// ListƯ¡ ������ �ִ�. �ߺ����� �ִ�.
		int[] iarr = {1,2};
		for (int i : iarr) {
			System.out.println( i);
			
		}
		// 3, 4�߰��ϰ� �ʹ� --> �ȵȴ�
		//{1,2,3,4}
		
		
		//List�� ����Ŭ������ ArraysList�� �̿�
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//<E> ���׸� �ڷ��� ���� �̸� �����ϴ°�
		
		arrList.add(1);
		arrList.add(2);
		
		System.out.println(arrList.size()); //ArrayList �ȿ� ��� ��Ұ� �ִ����� ��ȯ
		//3 , 4 �߰��ϱ�
		arrList.add(3);
		arrList.add(4);
		// 0�� �ε�����  -7�� �ֱ�
		arrList.add(0, -7);
		//��ü�� ����ϰ� �ʹ�. �ݺ����� ����Ұ�
		for( int i=0; i< arrList.size(); i++) { //0 1 2 3 4 5
			System.out.println(arrList.get(i) ); // �ε��� ��ȣ�� �ִ� ��Ҹ� ����ϱ�
			
			
		}
		
		//���ڿ��� ArrayList �ֱ�
		ArrayList<String> sArr = new ArrayList<String>();
		//��� �� �� �ٳ��� �Է�
		sArr.add("���");
		sArr.add("��");
		sArr.add("��");
		sArr.add("�ٳ���");
		
		//�ְ� �ٳ��� ���̿� ���ξ��� �ֱ�
		sArr.add(3, "���ξ���");
		//����� �� ���̿� �޷� �ֱ�
		sArr.add(1, "�޷�");
		
		
		//���� õ������ �����ϱ�
		//��Ʈ set()
				
		sArr.set(3, "õ����");
		
		//�ٳ��� �����ϱ�
		sArr.remove(5);
		
		//���ξ��� �����
		sArr.remove("���ξ���");
		
		//��ü ����ϱ�
		for( int i=0; i< sArr.size(); i++) { //0 1 2 3 4 5
			System.out.print(sArr.get(i) + " " ); // �ε��� ��ȣ�� �ִ� ��Ҹ� ����ϱ�
			
			
		}
		
		//���ξ����� �ֽ��ϱ�? cotains()
		if (sArr.contains("���ξ���")) {
			System.out.println("�ֽ��ϴ�");
		} else {
			System.out.println("�����ϴ�");
		}
		
		//����� �� �־��?
		if (sArr.contains("���") && sArr.contains("��")) {
			System.out.println("�ֽ��ϴ�");
			
		} else {
			System.out.println("�����ϴ�");
		}
		
		//���Կ� ������ ��� ������?
		//�迭����Ʈ�� ��� �ֳ���? isEmpty() 
		//���� ������ ������  ��� ġ���ּ���
		// ���Կ� ������ ������ ��� ġ���ּ���
		
		if(!sArr.isEmpty()) {
			sArr.clear(); //��Ҹ� ��δ� ����
			System.out.println("���� ������ ��� ġ�����ϴ�. ");
		}
		
		
		
		
		
	}

}
