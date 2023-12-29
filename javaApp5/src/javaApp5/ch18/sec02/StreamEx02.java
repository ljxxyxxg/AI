package javaApp5.ch18.sec02;

import java.util.*;

public class StreamEx02 {

	public static void main(String[] args) {
		// ��ǥ : �߰� ��Ʈ�� ó���ϴ� ��� ������
		// ��Ʈ�� ó�� ���� : �÷��� �Ǵ� �迭 --> �������� ��Ʈ�� --> �߰��ܰ�(����, ���ε�) - �������� --> ���� ��Ʈ��
		
		List<String> list = new ArrayList<String>();
		list.add("���");
		list.add("��");
		list.add("��");
		list.add("����");
		list.add("����");			
		
				
		list.stream()
			.filter(t -> t.equals("����") ) 
			.forEach(p -> System.out.println(p));
		
		//�ߺ������ϱ�
		
		list.stream()
			.filter(t -> t.equals("����") ) 
			.distinct()
			.forEach(p -> System.out.println(p + " ���̾�  "));	 
			
		//���� : �ٸ� ������ �ٲپ� �ֱ�
		//�÷���
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student("ȫ�浿", 85, "010-125-1234", 3.6));
		stList.add(new Student("ȫ�浿2", 90, "010-789-1234", 3.6));
		stList.add(new Student("ȫ�浿3", 89, "010-456-1234", 3.6));
		stList.add(new Student("ȫ�浿4", 96, "010-254-1234", 3.6));
		
		//��Ʈ�� �����
		stList.stream()
			  .mapToInt(s -> s.getScore())
			  .forEach( p -> System.out.println( p ));
		
		
		stList.stream()
		  .map(t -> t.getPhone())
		  .forEach( p -> System.out.println( p ));
	
		stList.stream()
		  .map(t -> t.getName())
		  .forEach( p -> System.out.println( p ));
	
		stList.stream()
		  .mapToDouble(t -> t.getSight())
		  .forEach( p -> System.out.println( p ));
		
		
		
			
	}

}

class Student {
	
	private String name;
	private int score;
	private String phone;
	private double sight;
	
	

	

	public Student(String name, int score, String phone,double sight) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
		this.sight = sight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public double getSight() {
		return sight;
	}

	public void setSight(double sight) {
		this.sight = sight;
	}
	
	
}