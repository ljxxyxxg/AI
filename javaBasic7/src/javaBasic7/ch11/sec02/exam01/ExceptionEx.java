package javaBasic7.ch11.sec02.exam01;

public class ExceptionEx {
	
	public static void printlength(String data) {
		int result = data.length(); //���ڿ��� ���� ���ϱ�
		System.out.println("���ڼ���" + result);
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	
//	try {	
//		//���� �߻��� �� ���� �ڵ� ������ ���Ѵ�.
//	} catch( ���ܸ� ���� ) {
//		//���� ���ܰ� �߻����� �� ó���ϴ� �ڵ� �ۼ�
//		
//		
//	}
	
	try {
		int a = 10;
		a = a/2;
		System.out.println( a );
		int[] iArr = {1,2,3};
		System.out.println(iArr[2]);
		
		printlength("this is ABC");
		printlength("ab"); // null ���� �ڷᰡ ����
		

		Class.forName ("java.lang.ABC");
		
		
		
		System.out.println("DB�ݱ⤡");
		System.out.println("�α׿����ϱ�");
		
		
		
		
	 } catch (ArithmeticException e) {
		 System.out.println("�и� 0�̸� �ȵȴ�.");
	 } catch( ArrayIndexOutOfBoundsException e ) {
		 System.out.println("�迭�� �ε��� ������ ������ϴ�");
	 } catch(NullPointerException e) {
		 e.printStackTrace();
		 System.out.println("Null�� �����ؼ� ������ �����ϴ�. ");
	 }  catch (Exception e) {
		   System.out.println("��翹���� �θ� Ŭ����");
	 } finally {
		 //���� �󱤾��� ������(��, �ʼ� ) ó���ؾߵ�
		 System.out.println("�и� 0�̸� �ȵȴ�.");
		 System.out.println("�α׿����ϱ�");
		 
	 }
	 
	
	
	}

}
