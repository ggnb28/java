package chap_05_01;

public class s {

	public static void main(String[] args) {
		
		
		
		  // score��� Array ����
	      int[] score ;
	      System.out.println();
	      
	      // ���̸� 20�̶� �����ϰ� �� �ε��� ���� 0
	      score = new int[20];
	      
	      // 0��° ���� 88�̶�� �Ѵ�.
	      score[0] = 88;
	      
	      // Ȯ���� ���� 0���� 20���� ����Ѵ�.
	      for ( int a = 0; a < 20 ; a++) {
	         System.out.printf("score[%d] : %s\n", a,score[a]);
	         
	      }
	      
	      /* ���ο� �迭�� ������ִµ�, ���̴� 3�̰� ���� �־���
	       ������ ���� 20�� �迭�� ���� ����ϱ� �ʰ� �� 
	       �� p.174�� ������ ��ü�� ��
	       
	       ������ score��� ���ÿ����� ������� 
	       score��� ���ÿ� ���� 20�� ���� �������(���� ��1 �̶���Ī)
	       ������ ���ÿ� ���̰� 3�� ���ο� ���� ����
	       ��1�� ������ ��ü�� �ڵ����� ����
	      */
	      score = new int[] { 25, 30, 50};
	      
	      System.out.println(score[0]);
	      System.out.println(score[1]);
	      System.out.println(score[2]);
	      System.out.println(score[3]);
	      System.out.println(score[0]);

		

	}

}
