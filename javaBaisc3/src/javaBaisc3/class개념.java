package javaBaisc3;

public class class개념 {

	public static void main(String[] args) {
		//필드 안에 값을 넣으려면
//			방법1) 객체생성되자 마자 넣는다.
//				  생성자를 이용한다
//			방법2) 필요할 때마다 넣는다.
//		          gettet 메소드를 이용한다.
		
			Student st1 = new Student("23010", "홍길동", 100, "010-123-1234"  );
		
			Teacher t1 = new Teacher("A32", "김미진", "컴공");
			
			System.out.println(st1.get이름());
			
			System.out.println(st1.get점수());
			
			System.out.println(st1.get이름());
			
			System.out.println(t1.get구분());
			
		//필요할때마다 넣기
		//빈 객체 생성하기
		Student st2 = new Student();
		Teacher tc2 = new Teacher();
		
		//값 넣기
		st2.set학번("2201");
		st2.set이름("이순신");
		st2.set점수(85);
		st2.set전화번호("010-234-2345");
		
		tc2.set코드("B101");
		tc2.set이름("박희연");
		tc2.set급여(2000000);
		
		System.out.println( st2.get학번() + "  " + st2.get이름() + "  " + st2.get점수());
		
				
				
				
				
				
				
				
	}


}
