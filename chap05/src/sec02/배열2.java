package sec02;

public class �迭2 {

	public static void main(String[] args) {
//	int []a; int a[]; �迭���� ��� �ΰ��� 
		/*
		 * int[] a; int b[]; String c[]; int[]d= {1,2,3}; //�迭 ���� �� ����
		 */
		/* �迭�� ��ü �հ�� ����� ���ϼ���. ����� doubleŸ������ for�� ��� */

		int[] d = { 51, 84, 93, 71, 65 };
		int sum = 0;
		for (int i = 0; i <= 4; i++) {
			sum += d[i];
		}
		System.out.println(sum);
		System.out.println((double)sum /  5);
		
		int[]t;
		/* t= {1,2,3}; ������ ���� �߻���
		 * �迭�� �⺻Ÿ���� �ƴ϶� ����Ÿ��. �⺻Ÿ���� �׳� ������ ������ ����Ÿ���� new�� ���ο���� �����ؾ���.  */
		
		int[]s=null; // int[]s; �� ����
		s=new int[] {1,2,3};
		int[]p=new int[] {1,2,3}; //���ٷ� ���̸� �̷�����.
		int[]q= {4,5,6}; //�����̸� �̷�����.
	}

}
