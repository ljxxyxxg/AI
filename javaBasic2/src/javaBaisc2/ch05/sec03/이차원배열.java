package javaBaisc2.ch05.sec03;

public class �������迭 {

	public static void main(String[] args) {
		
		
		int[][] intArr1 = { {1,2}, {2,3}, {3,4} }; //������ �迭 : [] [] �ΰ� ��
		
		String[][] strArr1 = { {"a", "b", "c"}, {"d", "e", "f"} };
		
		boolean[][] bArr1 = { {false, true}, {true, false}, {true, true}, {false, false} };

		System.out.println(intArr1[2][1]); //�� �迭�� ū �࿭ ,  �ڴ� ���� �࿭
		System.out.println(strArr1[1][1]); // "e"�� 1���� 1��
		System.out.println(bArr1[3][1]); 
		
		for(int i=0; i< intArr1.length; i++) { 			// i=0, 1, 2
			for(int j=0; j< intArr1[i].length; j++)  { // j=0, 1
				System.out.println( intArr1[i][j] + "  ");	
				
			}
			System.out.println();
		} //�迭�� ��簪 ����ϱ� : 00, 01, /;
		
		
		
		
		
		
		
	}

}
