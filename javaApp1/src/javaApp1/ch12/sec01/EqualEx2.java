package javaApp1.ch12.sec01;

public class EqualEx2 {

	public static void main(String[] args) {
		
		 Netplex n1 = new Netplex("100", "a123", "p123");
		 Netplex n2 = new Netplex("100", "a1234", "p1234");
		 Netplex n3 = new Netplex("100", "a1235", "p1235");
		 Netplex n4 = new Netplex("100", "a1236", "p123456");
		 
		 
		 if( n2.equals(n3)) {
			 
			 System.out.println("���� ��ü");
		 
		 
	}else {
		System.out.println("�ٸ� ����");
	}
	
	
	}

}


class Netplex {
	
	String key;
	String id;
	String pwd;
	
	public Netplex(String key, String id, String pwd) {
		super();
		this.key = key;
		this.id = id;
		this.pwd = pwd;
	}
	
	//���ü�� Ű�� ���� ���
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return key.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Netplex ) {
			Netplex np = (Netplex) obj;
			if(this.key.equals(np.key)) {
			return true;
			
			}
			
			
		}
		
		return false;
	}
	
	
	
	
	
}