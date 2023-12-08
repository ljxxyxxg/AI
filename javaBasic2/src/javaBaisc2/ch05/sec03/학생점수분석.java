package javaBaisc2.ch05.sec03;

import java.util.Scanner;

public class 학생점수분석 {

	public static void main(String[] args) {
		
		//키보드를 가지고 학생수 입력, 학생들 점수 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int menu = 1; //선택 변수
		int studentCount = 0; //학생수
		int[] score = null;// 배열 선언
		int max = 0; //최고점수
		double avg = 0.0; //평균
		int sum = 0;
		
		
	
		
		
		while( menu !=5 ) { //메뉴가 5가 아니면 종료하세요
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력  3.점수리스트  4.분석  5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>");
			menu = sc.nextInt();
			
			
			switch( menu ) {
			case 1 : System.out.print("학생수>");
					 studentCount = sc.nextInt();
					 score = new int[ studentCount ];
					 break;
			
			case 2 : for(int i=0; i<score.length; i++) {
				     System.out.print("score[" + i + "] > ");
				     score[i] = sc.nextInt();
				     
			};
					 break;
			case 3 : for(int i = 0; i < score.length; i++) {
					 System.out.println("score[" + i + "] : " + score[i]);
				
			};
					 break;
			case 4 : for(int i = 0; i< score.length; i++) {
					 sum = sum + score[i];
					 if(max < score[i])
				     max = score[i];
			
			};
					 avg = sum / (double) score.length;
					 System.out.println("최고점수" + max);
			         System.out.println("평균은" + avg);
			         
			         break;
			case 5 : System.out.println("종료");
					 break;
			default : System.out.println("1~ 5중 입력바랍니다.");
			
			
			
			
			
			
			}
			
		}

	}

}
