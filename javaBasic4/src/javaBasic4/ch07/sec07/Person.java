package javaBasic4.ch07.sec07;



// Ŭ������ final�� ������ �θ� �� �� ����. ~ �� Ŭ������ ���̸� �ڽ��� ���� 
// �޼ҵ忡 final�� ������ �����Ǹ� �� �� ����. ~ ������ ���̾�
// �ʵ忡 final ������ ���� ������ ���� �ȴ�
//��) ���ó�� final static int max

//�θ� Ŭ����
public class Person {

	String name;
	int age;
	final static int MAX = 100;
	
	public final void eat() {
		System.out.println("�Ϲ� ���� �Դ´�.");
		//max = max - 50; 
	}
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
}
