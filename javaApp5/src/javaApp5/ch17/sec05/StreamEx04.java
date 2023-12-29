package javaApp5.ch17.sec05;


import java.util.*;

public class StreamEx04 {

	public static void main(String[] args) {
		// 요소 정렬하기

		List<Student> sList = new ArrayList<Student>();
		sList.add( new Student("홍길동", 30));
		sList.add( new Student("신용권", 10));
		sList.add( new Student("유민선", 20));
		
		//요구 사항 점수를 기준으로 오름차순으로 정렬한 스트림 얻기
		sList.stream()
			 .sorted( new StudentCom() )
			 .forEach(p->System.out.println( p.getName() + " " + p.getScore() ));
		
		
		//루핑 : 반복해서 한개씩 가져와서 정리하기
		
		
		
		
		
		
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