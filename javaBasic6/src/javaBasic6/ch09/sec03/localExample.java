package javaBasic6.ch09.sec03;

public class localExample {

	public static void main(String[] args) {
		
		localExample le = new localExample();
		le.localM();
		
		
	}
	
	public void localM() {
		int a = 10;
		
		class AAA{
			int sa = 100;
			void m( ) {
				System.out.println(" �޼ҵ� �ȿ� �ִ� Ŭ������ �޼ҵ�");
			}
		}; ///end AAA��
		
		AAA aaa = new AAA(); //��ü ����
		aaa.m();//����ϱ�
		
		
		
	}
	
	

}
