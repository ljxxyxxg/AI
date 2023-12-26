package javaApp2.ch15.sec05;

import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		Person p1 =	new Person("ȫ�浿", 45);
		Person p2 =	new Person("���ڹ�", 25);
		Person p3 =	new Person("������", 31);
			
		TreeSet<Person>	t1 = new TreeSet< Person >();
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		for(Person p : t1) {
			System.out.println( p );
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Person implements Comparable<Person>{
	
	String name;
	Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
	
	//�̸� ������� Ʈ���� �޾��ֱ�
//	@Override
//	public int compareTo(Person o) {
//		int result = name.compareTo(o.name); //String Ŭ�������� �˾Ƽ� �����ش� 
//		System.out.println( result);
//		return result; //��� 2
//��� 1		if(result == 0) return 0;
//		else if( result < 0) return -1;
//		else return 1;
//	}
	
	// ���� ������� Ʈ���� �޾��ֱ�
	@Override
	public int compareTo(Person o) {
		//�� �˰����� ������ 0, ������ Ȧ��, ũ�� ����� �����Ѵ�.
		if( age == o.age) return 0;
		else if( age < o.age) return -1;
		else return 1;
		
	}
	
	
	
	
}





