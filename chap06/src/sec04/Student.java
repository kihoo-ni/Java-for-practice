package sec04;

public class Student {
	String gender; // 필드값 성별
	String deptCode; // 필드값 학과코드
	int Score; // 필드값 점수

	public Student(String gender, String deptCode, int score) { // 생성자  매개변수 3개
		//기본생성자는 생성되지 않음.
		this.gender = gender;
		this.deptCode = deptCode;
		this.Score = score;
	}

	void start() { // 성별, 학과코드, 점수, end메소드를 출력하기 위한 start 메소드
		System.out.println("성별 : " + gender);
		System.out.println("학과코드 : " + deptCode);
		System.out.println("점수 : " + Score);
		String grade=end(Score);
		System.out.println("당신의 학점은: "+grade);
	}

	String end(int x) { // 학점출력을 위한 end 메소드
		String result;
		if (x >= 90) {
			result="A";
		} else if (x>= 80) {
			result="B";
		} else if (x >= 70) {
			result="C";
		} else {
			result="F";
		}
		return result;
	}
}
