package sample_0324;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10]; // �迭�� ���� �˷��ִ� ��.
		int[] array2 = { 11, 3, 4, 5, 6, 8 }; // ��Ģ�� ������ ���׸� ���� ���ش�.
		// System.out.println(array[1]);
		for (int i = 0; i < 10; i++) {
			array[i] = (i + 1) * 10;
			System.out.println(i + " " + array[i]);
		}
		array2[0] = array2[2] + array2[4]; // �迭2�� 2�� �迭2�� 4�� ���ؼ� �迭2�� 0�� ����־��.
	}

}
