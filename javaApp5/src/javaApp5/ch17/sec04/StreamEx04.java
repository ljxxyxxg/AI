package javaApp5.ch17.sec04;


import java.util.*;

public class StreamEx04 {

	public static void main(String[] args) {
		// ��� �����ϱ�

		List<Student> sList = new ArrayList<Student>();
		sList.add( new Student("ȫ�浿", 30));
		sList.add( new Student("�ſ��", 10));
		sList.add( new Student("���μ�", 20));
		
		//�䱸 ���� ������ �������� ������������ ������ ��Ʈ�� ���
		sList.stream()
			 .sorted()
			 .forEach(p->System.out.println( p.getName() + " " + p.getScore() ));
		
	}

}

class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	
	
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
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

	@Override
	public int compareTo(Student o) {
		Integer s = Integer.valueOf(score);
		Integer os = Integer.valueOf(o.getScore()); //�⺻�� int�� Integer ��ü�� ����
		return s.compareTo(os);
	}

	
	
}