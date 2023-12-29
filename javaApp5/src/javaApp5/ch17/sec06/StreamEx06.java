package javaApp5.ch17.sec06;

import java.util.Arrays;

public class StreamEx06 {

	public static void main(String[] args) {
		// ���� : �ݺ��ؼ� �Ѱ��� �����ͼ� ó���ϱ�
		// ��Ī : ���ǿ� �����ϴ��� ���θ� �����ϴ� ����ó�����

		
		int[] intArr = {2, 4, 6, 7};
		
		
		boolean result =
				
					Arrays.stream( intArr )
						  .allMatch( i -> i % 2 == 0); // ��� ��Ʈ���� ���̸� ��
		System.out.println( result );
			  
		result =
				
				Arrays.stream( intArr )
					  .anyMatch( i -> i % 2 == 0); // ��� ��Ʈ������ �Ѱ��� ���̿� ��
	System.out.println( result );
		  
		
		result =
				
				Arrays.stream( intArr )
					  .noneMatch( i -> i % 2 == 0); // ��� ��Ʈ������ �����̸� ��
	System.out.println( result );
	
	
	
	int[] intArr2 = {};
	
	long count =
			
		Arrays.stream(intArr2)
			.filter( n -> n % 2 == 0)
			.count();
		
		System.out.println("¦���� ������?" + count);
		
		//Ȧ���� ������ ���ϱ�
		
	int oddSum =	
		Arrays.stream(intArr2)
				.filter(n -> n % 2 != 0)
				.sum();
		System.out.println("Ȧ���� ����?" + oddSum); //reduce() - �⺻ �հ�, ���, �ִ�, �ּ�, ���� �Լ��� �����ϰ� �ٸ����� ����� �ʿ��� ��� �̿��Ѵ�
													//��) �л� , ǥ������, Ȯ�� ��
												  //collect -��������� ����Ʈ�� ����� �ְ� �ʹ�. �迭�� ����� �ְ� �ʹ�.
	
	}

}


