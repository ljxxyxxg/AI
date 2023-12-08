package javaBaisc3;

public class Student {

	String 학번; //필드 아이템 항목
	String 이름;
	int 점수;
	String 전화번호;
	
	//생성자 == 클래스 이름과 똑같고 객체화(힙메모리에 올라갈때)될때 자동으로 실행된다.
	public Student(String 학번, String 이름, int 점수, String 전화번호) {
		// TODO Auto-generated constructor stub
		this.학번 = 학번;
		this.이름 = 이름;
		this.점수 = 점수;
		this.전화번호 = 전화번호;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}
	


	public Student1() {
		// TODO Auto-generated constructor stub
	}


	public void set학번(String 학번) {
		this.학번 = 학번;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get점수() {
		return 점수;
	}

	public void set점수(int 점수) {
		this.점수 = 점수;
	}

	public String get전화번호() {
		return 전화번호;
	}

	public void set전화번호(String 전화번호) {
		this.전화번호 = 전화번호;
	}

	int 점수계산() { //점수계산하기
		
		return 0;

	};
	
	void 성적출력하기() {
		
		
		
	};
	
	
	void 입력하기() {
	
	
	};
	
	String 장학금대상자() {
		
		return "홍길동";
		
	};
	
	
	boolean 합격여부구하기() {
		
		return true;
		
	};
	


	
}
