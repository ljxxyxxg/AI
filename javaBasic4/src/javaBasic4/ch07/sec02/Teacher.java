package javaBasic4.ch07.sec02;

public class Teacher extends Student{
	
	
	String major;
	
	

	
	public void teach() {
		System.out.println("����ģ��");
		
	} 
	
	public Teacher() {
		super("ȫ�浿", 30, "��ǻ�� ����"); //�θ������ ȣ�� ù�ٿ��� ����Ѵ�
		System.out.println("�ڽ� Ŭ���� �� me");
	}
	 
	public Teacher(String name, int age, String dept, String major) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.major = major;
	}

}
