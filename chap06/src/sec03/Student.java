package sec03;

public class Student {
	String name; // �̸� <<�ּ��ޱ� ����
	int age; // ����
	String studentId; // �й�
	String gender; // ����
	String phoneNumber; // ����ó <<���� ����۾��� �ʿ���� ���� ������ String

	Student() { // �⺻������

	}

	Student(String name, int age) { // �Ű����� 2�� ������
		this.name = name;
		this.age = age;
	}

	Student(String name, String studentId, String phoneNumber) { // �Ű����� 3�� ������
		this.name = name;
		this.studentId = studentId;
		this.phoneNumber = phoneNumber;
	}
	// ���콺 ������ Ŭ�� source, generate constructor using field �� ���� ���������.

}
