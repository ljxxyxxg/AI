package javaApp1.ch12.sec01;

public class ObjectEx {//extends Object ==  �����Ǿ��ִ�. {//�ڡڡڡڡڡ��߿䵵�ڡڡڡڡ�

	public static void main(String[] args) {
		//Object�� �޼ҵ�� ��� Ŭ�������� �� �� �� �ִ�. ������ �� �� �ִ�.
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		if (obj1 == obj2) { //obj1�� obj2�� �ּҰ� ������? false
			System.out.println("����");
		} else { 
			System.out.println("�ٸ���");
		}
		
		if (obj1.equals(obj2)) { //obj1�� obj2�� �ּҰ� ������? false
			System.out.println("����");
		} else { 
			System.out.println("�ٸ���");
		}
		
		if (obj1.equals(obj3)) { //obj1�� obj3�� �ּҰ� ������? false
			System.out.println("����");
		} else { 
			System.out.println("�ٸ���");
		}
		
		
		
	}

}

class Member {
	public String id;
	public String pwd;
	public String name;
	//id�� ���� pwd ������ ���� ��� �� ���̴�.
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