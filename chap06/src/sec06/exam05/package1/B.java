package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3=1; private�� ���ٺҰ�

		a.method1(); // public�� ��� ���ٰ���
		a.method2(); // default�� ���� ��Ű���� ���ٰ���.
		// a.method3(); private�� ���� �Ұ�
	}
}
