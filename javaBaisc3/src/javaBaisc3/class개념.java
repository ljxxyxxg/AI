package javaBaisc3;

public class class���� {

	public static void main(String[] args) {
		//�ʵ� �ȿ� ���� ��������
//			���1) ��ü�������� ���� �ִ´�.
//				  �����ڸ� �̿��Ѵ�
//			���2) �ʿ��� ������ �ִ´�.
//		          gettet �޼ҵ带 �̿��Ѵ�.
		
			Student st1 = new Student("23010", "ȫ�浿", 100, "010-123-1234"  );
		
			Teacher t1 = new Teacher("A32", "�����", "�İ�");
			
			System.out.println(st1.get�̸�());
			
			System.out.println(st1.get����());
			
			System.out.println(st1.get�̸�());
			
			System.out.println(t1.get����());
			
		//�ʿ��Ҷ����� �ֱ�
		//�� ��ü �����ϱ�
		Student st2 = new Student();
		Teacher tc2 = new Teacher();
		
		//�� �ֱ�
		st2.set�й�("2201");
		st2.set�̸�("�̼���");
		st2.set����(85);
		st2.set��ȭ��ȣ("010-234-2345");
		
		tc2.set�ڵ�("B101");
		tc2.set�̸�("����");
		tc2.set�޿�(2000000);
		
		System.out.println( st2.get�й�() + "  " + st2.get�̸�() + "  " + st2.get����());
		
				
				
				
				
				
				
				
	}


}
