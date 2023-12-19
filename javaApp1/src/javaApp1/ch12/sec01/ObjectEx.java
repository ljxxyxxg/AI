package javaApp1.ch12.sec01;

public class ObjectEx {//extends Object ==  생략되어있다. {//★★★★★★중요도★★★★★

	public static void main(String[] args) {
		//Object의 메소드는 모든 클래스들이 다 쓸 수 있다. 재정의 할 수 있다.
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		if (obj1 == obj2) { //obj1와 obj2의 주소가 같나요? false
			System.out.println("같다");
		} else { 
			System.out.println("다르다");
		}
		
		if (obj1.equals(obj2)) { //obj1와 obj2의 주소가 같나요? false
			System.out.println("같다");
		} else { 
			System.out.println("다르다");
		}
		
		if (obj1.equals(obj3)) { //obj1와 obj3의 주소가 같나요? false
			System.out.println("같다");
		} else { 
			System.out.println("다르다");
		}
		
		
		
	}

}

class Member {
	public String id;
	public String pwd;
	public String name;
	//id가 같고 pwd 같으면 같은 사람 할 것이다.
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
		Member m = (Member) obj;
		if(this.id.equals(m.id)) {
			return true;
			
		}
		}
		
		return false;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
