package chap_06_01;

public class NewCal {
	// 10+20; 10, 20 �ǿ�����, + ������
	// access modifier : ���� ������, ���� �ĺ���
	// public(������), 
	// protected(���� ��Ű���� �����ʾƵ� ��� ���迡 ������ ���),
	// �⺻(�ƹ��͵� ���� ����, ���� ��Ű���� �ִ� Ŭ�����鸸 ����ϰ� ���ٷ�),
	// private (��ȥ�ڻ���Ҷ�)
	
	private int operand1;
	private int operand2;
	private String operator;
	
	// constructor : ��ü �ʱ�ȭ
	// this : 
	public NewCal() {// �⺻(default) ������
		this.operand1 = 10;
		this.operator = "+";
		this.operand2 = 20;
	}
	public NewCal(int o1, String op, int o2) {
		this.operand1 = o1;
		this.operator = op;
		this.operand2 = o2;
	}
	
	// custom method
	// int : ��ȯ����, ����Ÿ�� - �޼ҵ� ó���� ��ȯ�ϴ� ���� ���� 
	public int calc() {
		int result = 0; // ��������
		if(operator.equals("+"))
			result = operand1 + operand2; // operand1.. : �ν��Ͻ� ����
		else if(operator.equals("-"))
			result = operand1 - operand2;
		else if(operator.equals("*"))
			result = operand1 * operand2;
		else if(operator.equals("/"))
			result = operand1 / operand2;
		
		return result;
	}

}
