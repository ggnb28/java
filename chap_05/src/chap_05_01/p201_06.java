package chap_05_01;

import java.util.Scanner;

public class p201_06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.println("����> ");
			
		    int selectNo = Integer.parseInt(scanner.nextLine());
		    
		    if(selectNo == 1) {
		    	System.out.println("�л���> ");
		    	studentNum += Integer.parseInt(scanner.nextLine());
		    	scores = new int[studentNum];
		    }else if(selectNo == 2) {
		    	for (int i = 0; i < scores.length; i++) {
		    		System.out.println("scores["+i+"]>");
		    		scores[i] = Integer.parseInt(scanner.nextLine());
		    	}
		    	
		    }else if(selectNo == 3) {
//		    	System.out.println(scores[0]);
//		    	System.out.println(scores[1]);
//		    	System.out.println(scores[]);
		    	for (int i = 0; i < scores.length; i++) {
		    		System.out.println(scores[i]);
		    	}
		    }else if(selectNo == 4) {
		    	int sum =0;
		    	int max = 0;
		    	for (int i = 0; i < scores.length; i++) {
		    		sum += scores[i];
		    		if(scores[i]>max) {
		    			max=scores[i];
		    		}
		    	}
		    	double avg= (double) sum/scores.length;
		    	System.out.println("�ְ� ����: "+max);
		    	System.out.println("��� ����: "+avg);
		    	
		    }else if(selectNo == 5) {
		    	run = false;
		    }
		}
		System.out.println("���α׷� ����");

	}

}