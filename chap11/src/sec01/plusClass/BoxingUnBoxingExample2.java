package sec01.plusClass;

public class BoxingUnBoxingExample2 {

	public static void main(String[] args) {

		// Integer obj=new Integer(100); ���� �ڽ� �ڵ�

		Integer obj = 100;// �ڵ���ڽ�
		System.out.println(obj);

		// int value=obj.intValue(); ���� ��ڽ� �ڵ�
		// ���԰��� int Ÿ���̸� �ڵ����� ��ڽ�����.
		int value = obj;
		System.out.println(value);

		Integer obj2 = new Integer("100");
		// "100"�� �� obj2�� ����Ŭ���� Ÿ������ ��.
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt�� String Ÿ���� Int Ÿ������ ����
		// obj2�� String Ÿ���� �ƴϹǷ� ���Ұ���
		int value2 = Integer.valueOf(obj2);
		// valueOf�� �̿��ؾ� ������.

		int value3 = Integer.parseInt("300");
		System.out.println(value3);

	}

}
