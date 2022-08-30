package chap11api;

public class APIExample {

	public static void main(String[] args) {
		Overriding over = new Overriding();
//		Class cl = Class.forName("")
//		Overriding over2 = (Overriding) Overriding.class;
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		if(i1==i2)
			System.out.println("true");
		else
			System.out.println("false");
		// 
		
		
		String s1 = new String("����Ͻ� �м���");
		String s2 = new String("����Ͻ� �м���");
		if(s1==s2) // �� ���������� �����ϴ� ��ü�� ������?
			System.out.println("true");
		else
			System.out.println("false");
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		over.testEquals(s1, s2);
		
		
		
		
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		if(o1==o2)
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		over.testEquals(o1, o2);
		// shift ������ ��Ʈ���� ����
		// 128�� ��Ʈ���� 1000 0000 �������� �����б�
		//			  0001 0000 
		// 1�� �������� �ж����� 2�� ������ ȿ��
 	    System.out.println(Integer.toBinaryString(128));
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
		
		Integer intRef = new Integer(100);
		try {
			Integer intRef2 = Integer.valueOf("100L");
			
			System.out.println("���� �߻��� ���� �ȵ�");
			
		} catch(NumberFormatException nfe) {
			System.out.println("���ܹ߻� ó�� : " + nfe.getMessage());
			
		}finally {
			System.out.println("���� �߻� ���ο� ������� ����Ǿ�� �ϴ� ����");
		}
		
		Integer intRef3 = (Integer) 100;
		System.out.println("����ó�� �� " + intRef3);
		// wrapper class : auto boxing
		

	}

}
