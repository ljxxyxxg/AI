import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1�ܰ� �Է��� �޴´�. Ű����� �Է��� �� �ִ� Ŭ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("---ȭ���� ������, ������ ȭ���� �ٲٱ�---");
		System.out.println(" ���ڸ� �Է��ϼ���?(C,F)");
		String word = sc.next();
		System.out.println("�ٲٷ��� �µ��� �Է��ϼ���.");
		int temp = sc.nextInt();
		
		//2�ܰ� ���ڰ� "C"���� "F"������ �Ǵ��ϱ� : ������ ��� equals ���
		double result = 0.0;
		if( word.equals("C") || word.equals("c") ) { result  = (9.0 / 5.0) * (temp + 32);} else if( word.equals("F") || word.equals("f")) { result = (5.0/9.0) * (temp - 32);}
		
		
		//3�ܰ� ��� ����ϱ�
		System.out.println( "������" + result );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
