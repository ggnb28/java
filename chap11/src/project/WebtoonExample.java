package project;

import java.util.ArrayList;

public class WebtoonExample {
	public static ArrayList<Book> alBook = new ArrayList<>();
	
	public static void main(String[] args) {
		Book w1 = new Webtoon("i-1234", "��ȥ�� ������", "��Ÿ��", "�߰�");
		Book w2 = new Webtoon("i-1235", "�̻�2", "���", "����ȣ");
		Book w3 = new Webtoon("i-1236", "�����", "������", "����");
		
	    alBook.add(w1);
	    alBook.add(w2);
	    alBook.add(w3);
	    alBook.add(new Webtoon("i-1236", "��ǳ��", "�ڹ�", "�ſ���"));
	    
	    // ���
	    for(Book b : alBook)
	    	System.out.println(b.toString()); // Object : toString, equals, hashCode

	}

}