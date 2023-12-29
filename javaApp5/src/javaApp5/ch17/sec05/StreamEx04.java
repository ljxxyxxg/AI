package javaApp5.ch17.sec05;


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
			 .sorted( new StudentCom() )
			 .forEach(p->System.out.println( p.getName() + " " + p.getScore() ));
		
		
		//���� : �ݺ��ؼ� �Ѱ��� �����ͼ� �����ϱ�
		
		
		
		
		
		
	}

}

class StudentCom implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		Integer o1s = Integer.valueOf(o1.getScore()); //30
		Integer o2s = Integer.valueOf(o2.getScore()); //10
		
		return o1s.compareTo(o2s);
	}
	
	
	
	
}

class Student  {
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



	
	
}