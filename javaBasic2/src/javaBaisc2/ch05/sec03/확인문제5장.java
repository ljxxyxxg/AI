package javaBaisc2.ch05.sec03;

public class Ȯ�ι���5�� {

	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83, 92 ,96},
				{78, 83, 93, 87, 88}// 0,1,2 �� 3ĭ
									// 2���� ���̴ϱ� 5ĭ
				
		};

		System.out.println(array.length);
		System.out.println(array[2].length);
		
		int[] array1 = {1, 5, 3, 8, 2 };
		int max = -99;
		
		
		for( int i=0; i<array1.length; i++) {
			if( max < array1[i] ) max = array1[i]; //1<5 5 < 3
			
			}
		
			System.out.println( max );
			
			
		int[] array2 = {1, 5, 3, 8, 2 };
		int min = 1000;
			
			
		for( int i=0; i<array2.length; i++) {
			if( min > array2[i] ) min = array2[i]; //1<5 5 < 3
				
			}
			
			System.out.println( min );
			
			
		//
		int[][] array3 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				
		};
		
		int sum = 0;
		for(int i = 0; i< array3.length; i++) { //���� ���̸�ŭ �ݺ�
			for(int j = 0; j<array3[i].length; j++) { // ���� ���̸�ŭ �ݺ�
				sum = sum + array3[i][j]; 
			}
			
			System.out.println(sum);
			System.out.println(array3[0].length);
			int count = array3[0].length + array3[1].length + array[2].length;
			System.out.println(count);
			
			double avg = sum/ (double) count;
			System.out.println(avg);
					
		
		};
	
		
			
	}

}
