package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// 
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		   //정수형  ,  문자열
		
		//삽입하기 넣기
		m1.put(1, "이순신");
		m1.put(2, "박수현");
		m1.put(3, "홍길동");
		
		
		
		
		//삭제하기
		m1.remove(3);
				
		//전체 출력하기
		//1단계 키들을 모은다. keySet()
		//2단계 키 1개씩 출력한다.
		Set<Integer> m1keys = m1.keySet();
		
		Iterator<Integer> it = m1keys.iterator();
		while( it.hasNext() ) {
			System.out.println( m1.get(it.next()) + "@@@"); //value 값 인쇄
		}
		
		
		
		
		Map<String, Double> m2 = new HashMap<String, Double>();
		
		//값 넣어보기
		
		m2.put("b", 1.1);
		m2.put("b", 3.5);
		m2.put("b", 4.2);
		
		//출력하기, 꺼내보기 get으로 꺼내기
		System.out.println( m1.get( 1 ) ); //키를 넣으면 값이 나온다.
		System.out.println( m1.get( 2 ) );
		
		//3,5출력해보기
		System.out.println( m2.get("b"));
		
		//크기 구하기
		System.out.println( m1.size() ); //키가 동일하면 동등객체로 판단하고 새로운 것을 대체 제일 마지막 키값을 남긴다.
		
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("홍길동", "과장");
		m3.put("이순신", "부장");
		m3.put("최경미", "차장");
		m3.put("홍길동", "사원");
		
		//크기는?
		System.out.println( m3.size() );
		//이순신의 직책은?
		System.out.println( m3.get("이순신"));
		//최경미의 직책은?
		System.out.println( m3.get("홍길동"));
		//홍길동의 직책은?
		System.out.println( m3.get("최경미"));
		//최경미 삭제
		m3.remove("최경미");
		
		//전체 출력하기
		System.out.println( m3.get("홍길동"));
		System.out.println( m3.get("이순신"));
		
		
		//생각 전체 출력하려면 key를 반복해서 넣어주면 된다/
		//key set() 모든 키를 set() 담는다.
		Set<String> m3keys = m3.keySet(); //키들을 담는다.
		m3keys.iterator();
		
		Iterator<String> it1 = m3keys.iterator();
		while ( it.hasNext()) {
			//System.out.println( it.next() );// 키 값들이 반복해서 출력
			System.out.println( m3.get(it1.next())+"###");
		}
		
		
		
		
		
		
		
		
	}

}
