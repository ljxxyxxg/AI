package javaApp5.ch17.sec01;

import java.util.*;
import java.util.stream.*;

public class StreamEx01 {

	public static void main(String[] args) {
		// ��Ʈ�� - �帣��
		// ��Ʈ�� ���� : 1�ܰ� �÷��� �Ǵ� �迭 --> 2�ܰ� �������� ��Ʈ�� --> 3�ܰ� �߰��ܰ�(����, ���ε�) - �������� --> 4�ܰ� ������Ʈ��
		
//		//1�ܰ�
//		List<Student> list = Arrays.asList(new Student("ȫ�浿", 10),
//					  					   new Student("�ſ��", 20),
//					  					   new Student("���̼�", 30));
//		
//		//2�ܰ� �������� ��Ʈ�� ����
//		Stream<Student> studentStream = list.stream();
//		
//		
//		//3�ܰ� ������ ������ ���� �߰��ܰ�(����, ���ε�)
//		IntStream scoreStream = studentStream.mapToInt( student -> student.getScore() );
//		
//		
//		//4�ܰ� ������ ����� ���ϱ� (������Ʈ��)
//		double avg = scoreStream.average().getAsDouble();
//		
//		System.out.println( avg );
		
		
		//���2) 1�ܰ�
		List<Student> list = Arrays.asList(new Student("ȫ�浿", 10),
									       new Student("�ſ��", 20),
									       new Student("���̼�", 30));
		
		//2�ܰ�
		double avg =
					list.stream()
						//3�ܰ�
						.mapToInt( student -> student.getScore() )
						//4�ܰ�
						.average()
						.getAsDouble();
		System.out.println( avg );
						
			
			
			
			
			
			
		
	}

}

class Student {
	
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

	public int getScore() {
		return score;
	}


	
	
}