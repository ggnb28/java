package chap07interf;

public class Something {
	// ĸ��ȭ(encapsulation) : Ŭ������ �ʵ�, �޼ҵ� ����
	// -> �ڷ��߻�ȭ(data abstraction) - �ڷḦ ó���ϱ� ���� �ּ����� �������� ����Ҽ��ֵ��� ��, 
	// ��������(information hiding)
	// �ڷᱸ��(Date structure) : ���
	private String title;
	private String content;
	private String writer;
//	private String regDate;
	
	// �ڷᱸ���� Ȱ���ϴ� �޼ҵ� : ����, ����
	public void printAllFields() {
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
	}

}