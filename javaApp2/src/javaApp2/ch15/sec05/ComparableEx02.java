package javaApp2.ch15.sec05;

import java.util.TreeSet;

public class ComparableEx02 {

	public static void main(String[] args) {
		Board b1 = new Board( 1, "제목1", "작성자1");
		Board b2 = new Board( 4, "제목7", "작성자5");
		Board b3 = new Board( 3, "제목0", "작성자0");
		Board b4 = new Board( 0, "제목2", "작성자9");
		
		//TreeSet 객체화 해서 달아주기
		
		TreeSet<Board> ts = new TreeSet<>();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		//번호 순서대로 
		for( Board b : ts) {
			System.out.println( b );
		}
		ts.descendingSet();
		

	}

}

//게시판 객체
class Board implements Comparable<Board>{
	
	Integer no; //게시판번호
	String title; //게시판 제목
	String writer; //게시글 작성자
	
	public Board(Integer no, String title, String writer) {
		super();
		this.no = no; 
		this.title = title;
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no + " " + title + " " + writer;
	}
	
	@Override
	public int compareTo(Board o) {
		if( no == o.no) return 0;
		else if (no < o.no) return -1;
		else return 1;
	}
	
	
	
	
	
}
