package chap_04_02;

import java.util.Scanner;

public class p161_07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.���� : 2.��� : 3.�ܰ� : 4.����");
			System.out.println("--------------------------------");
			System.out.println("����> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.println("���ݾ�> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.println("��ݾ�> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("�ܰ�> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
				
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		
	}

}
