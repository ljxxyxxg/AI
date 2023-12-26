package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		//Set Ư¡ : �ߺ��� ��Ҹ� �����Ѵ�. �ߺ�������� �ʴ´�
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(50);
		set.add(80);
		
		System.out.println(set.size());
		
		Iterator<Integer> it  = set.iterator();	//�ݺ�
		while (it.hasNext()) {
			System.out.println(it.next()); //�������� ��µȴ�.
			
			
		}
		
		// set�ȿ� 40�� �ֳ���? �ƴϿ�
		System.out.println( set.contains( 40 ) );
	
		// set �ȿ� ��Ұ�   ��� �ֳ���?
		System.out.println( set.isEmpty() );
		
		//set�ȿ� ��Ҹ� 50�� ���켼��
		System.out.println( set.remove(50) );
		
		//���
		
		it = set.iterator();//�ݺ���
		while (it.hasNext()) {
			System.out.println(it.next());//�������� ��µȴ�.
		}
		
		
		//set�ȿ� ��� 100 �߰��ϱ�
		
		set.add(100);
		
		//set�ȿ� ��� 80 �����ϱ�
		System.out.println( set.remove(80) );
		
		//����ϱ�
		while(it.hasNext()) {
			System.out.println(it.next());

		}
		
		
		
		
		
	}

}
