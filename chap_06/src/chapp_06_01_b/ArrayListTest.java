package chapp_06_01_b;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String>();
		
		
//		Integer k = new Integer(100); // k�� Integer Ŭ������ ����
//		// implicit type conversion (������ ����ȯ) : ����ڽ�/��ڽ�
//		int j = 50;
//		System.out.println(Integer.toBinaryString(k));
		
		
		ale.add(new String("��")); //index 0�� ����
		ale.add("����");
		ale.add("�����͸�");
		ale.add("Ȱ����");
		ale.add("������");
		ale.add("����Ͻ�");
		ale.add("�м��� ����");
		// for�� : �ݺ�Ƚ���� ������ ��� ���, �������ٰ���,
		// ������� ���� ����
		
		for(int i =0; i< ale.size();i++) 
			System.out.println(ale.get(i)+" ");
		for(String s : ale) // foreach statement : collection ��ü�� ���� ����
			System.out.println(s + " ");
			
			
		
	}

}
