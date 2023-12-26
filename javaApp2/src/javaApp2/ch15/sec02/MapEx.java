package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// 
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		   //������  ,  ���ڿ�
		
		//�����ϱ� �ֱ�
		m1.put(1, "�̼���");
		m1.put(2, "�ڼ���");
		m1.put(3, "ȫ�浿");
		
		
		
		
		//�����ϱ�
		m1.remove(3);
				
		//��ü ����ϱ�
		//1�ܰ� Ű���� ������. keySet()
		//2�ܰ� Ű 1���� ����Ѵ�.
		Set<Integer> m1keys = m1.keySet();
		
		Iterator<Integer> it = m1keys.iterator();
		while( it.hasNext() ) {
			System.out.println( m1.get(it.next()) + "@@@"); //value �� �μ�
		}
		
		
		
		
		Map<String, Double> m2 = new HashMap<String, Double>();
		
		//�� �־��
		
		m2.put("b", 1.1);
		m2.put("b", 3.5);
		m2.put("b", 4.2);
		
		//����ϱ�, �������� get���� ������
		System.out.println( m1.get( 1 ) ); //Ű�� ������ ���� ���´�.
		System.out.println( m1.get( 2 ) );
		
		//3,5����غ���
		System.out.println( m2.get("b"));
		
		//ũ�� ���ϱ�
		System.out.println( m1.size() ); //Ű�� �����ϸ� ���ü�� �Ǵ��ϰ� ���ο� ���� ��ü ���� ������ Ű���� �����.
		
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("ȫ�浿", "����");
		m3.put("�̼���", "����");
		m3.put("�ְ��", "����");
		m3.put("ȫ�浿", "���");
		
		//ũ���?
		System.out.println( m3.size() );
		//�̼����� ��å��?
		System.out.println( m3.get("�̼���"));
		//�ְ���� ��å��?
		System.out.println( m3.get("ȫ�浿"));
		//ȫ�浿�� ��å��?
		System.out.println( m3.get("�ְ��"));
		//�ְ�� ����
		m3.remove("�ְ��");
		
		//��ü ����ϱ�
		System.out.println( m3.get("ȫ�浿"));
		System.out.println( m3.get("�̼���"));
		
		
		//���� ��ü ����Ϸ��� key�� �ݺ��ؼ� �־��ָ� �ȴ�/
		//key set() ��� Ű�� set() ��´�.
		Set<String> m3keys = m3.keySet(); //Ű���� ��´�.
		m3keys.iterator();
		
		Iterator<String> it1 = m3keys.iterator();
		while ( it.hasNext()) {
			//System.out.println( it.next() );// Ű ������ �ݺ��ؼ� ���
			System.out.println( m3.get(it1.next())+"###");
		}
		
		
		
		
		
		
		
		
	}

}
