package javaBasic4.ch07.sec02;


//�ڽ� Ŭ���� = ���� Ŭ����
public class Student extends Person{
	
	
	String dept;//����
	
	public void study() {
		System.out.println("�����Ѵ�.");
	}

	
	public Student() {
		//super(); //�θ������ ȣ��
		System.out.println("�θ�Ŭ���� �ƹ��� Ŭ���� ������ �ִ� ������ " + name);
	}

	public Student(String �̸�, int ����, String ����) {
		this.name = �̸�;
		this.age = ����;
		this.dept = ����;
		
		
		
		
	}
	
	
}
