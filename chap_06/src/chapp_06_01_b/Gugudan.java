package chapp_06_01_b;

public class Gugudan {
	private int col = 9;
	private int row = 9; // ������ ���� �����ϴ� ��
	int dan; // �ν��Ͻ� ���� : �������� ������ �����ϴ� ��
	
	// ������ �ܸ� ���
	public void printOne(int dan) { // dan : ���� ����, �޼ҵ� �ȿ����� ��ȿ
		for(int i = 1; i <= col; i++) {
			System.out.println(dan + "X" + i + "=" + dan*i);
		}
	}
	
	// 2~9 ���� ���
	public void printAll() {
		for(int i = 2; i <= row; i++) {
			printOne(i);
		}
	}
	// ������ �ܺ��� 9�ܱ��� ���
	public void printFrom(int dan) {
		for(int i = dan; i <= row; i++)
			printOne(i);	
	}
}
	
