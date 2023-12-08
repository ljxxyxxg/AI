package javaBaisc2.ch05.sec03;

public class 이차원배열 {

	public static void main(String[] args) {
		
		
		int[][] intArr1 = { {1,2}, {2,3}, {3,4} }; //이차원 배열 : [] [] 두개 들어감
		
		String[][] strArr1 = { {"a", "b", "c"}, {"d", "e", "f"} };
		
		boolean[][] bArr1 = { {false, true}, {true, false}, {true, true}, {false, false} };

		System.out.println(intArr1[2][1]); //앞 배열은 큰 행열 ,  뒤는 작은 행열
		System.out.println(strArr1[1][1]); // "e"는 1행의 1행
		System.out.println(bArr1[3][1]); 
		
		for(int i=0; i< intArr1.length; i++) { 			// i=0, 1, 2
			for(int j=0; j< intArr1[i].length; j++)  { // j=0, 1
				System.out.println( intArr1[i][j] + "  ");	
				
			}
			System.out.println();
		} //배열안 모든값 출력하기 : 00, 01, /;
		
		
		
		
		
		
		
	}

}
