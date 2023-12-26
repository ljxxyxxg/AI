package javaApp2.ch15.sec03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		// Map
		Member m1 = new Member( "a100", 123);
		Member m2 = new Member( "a200", 234);
		Member m3 = new Member( "a300", 345);
		//Map 키는 1 값은 m1
		HashMap<Integer, Member> hmap = new HashMap<Integer, Member>();
		//데이터 입력하기
		hmap.put(1, m1);
		hmap.put(2, m2);
		hmap.put(3, m3);
		//"a300,345출력하기 힌트: 키가 3이다
		
		System.out.println(hmap.get(3));
		
		//키들만 출력하기
		Set<Integer> keys = hmap.keySet();
		Iterator<Integer> it = keys.iterator();
		while( it.hasNext()) {
			Integer itkey = it.next();
			System.out.println(itkey + " " + hmap.get( itkey ));
		}
		  
		HashMap<Member, Integer> hmap2 = new HashMap<Member, Integer> ();
		hmap2.put(m1, m1.pwd);
		hmap2.put(m2, m2.pwd);
		hmap2.put(m1, m1.pwd);
		
		//a100일때, pwd는?
		System.out.println(hmap2.get( m1));
		
		Member m4 = new Member("a300", 345);
		hmap2.put(m1, m1.pwd);
		
		Member m5 = new Member("a300", 346);
		hmap2.put(m5, m5.pwd);
		
		System.out.println( hmap2.size());
		//동등객체를 id와 pwd 같으면 같은 것 코딩하려면
		Set<Member> keys1 = hmap2.keySet();
		Iterator<Member> k1 = keys1.iterator();
		while( k1.hasNext()) {
			System.out.println( k1.next());
		}
		
		
		
	}

}


class Member {
	String id;
	Integer pwd;
	
	
	
	public Member(String id, Integer pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
		
		
		
		
	}
	
	@Override
	public String toString() {
		return id + "  " + pwd;
	}
	
	@Override
	public int hashCode() {
		//동등객체 판단은 hashCode()가 같고 equals()가 같으면 동등객체임
		return id.hashCode() + pwd.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member ) {
			Member m = (Member) obj;
			if(id.equals(m.id) && pwd ==m.pwd) return true;
		}
		return false;
	}
	
	
}