package testPractice;

//������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
//���ѻ���
//arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�. -- �� ������
//arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ� -- �� ������

public class solution1 { // solution Ŭ���� �ȿ�
	public double solution(int[] arr) { //solution �ż��� ���� int[] arr �迭
		int num = 0; //int num ���� ����
		double answer = 0; // double answer ���� ����

		// �迭�� ��� ���Ұ� ���ϱ�
		for (int i = 0; i < arr.length; i++) { //for�� �迭 ����
			num += arr[i];
		}
		// double������ �� ��ȯ
		answer = (double) num / arr.length;
		return answer;

	}
}