package sec04;

public class Student {
	String gender; // �ʵ尪 ����
	String deptCode; // �ʵ尪 �а��ڵ�
	int Score; // �ʵ尪 ����

	public Student(String gender, String deptCode, int score) { // ������  �Ű����� 3��
		//�⺻�����ڴ� �������� ����.
		this.gender = gender;
		this.deptCode = deptCode;
		this.Score = score;
	}

	void start() { // ����, �а��ڵ�, ����, end�޼ҵ带 ����ϱ� ���� start �޼ҵ�
		System.out.println("���� : " + gender);
		System.out.println("�а��ڵ� : " + deptCode);
		System.out.println("���� : " + Score);
		String grade=end(Score);
		System.out.println("����� ������: "+grade);
	}

	String end(int x) { // ��������� ���� end �޼ҵ�
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
