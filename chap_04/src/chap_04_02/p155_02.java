package chap_04_02;

public class p155_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int x = 0;
//		for(x=1; x<=20; x++){
//	    for(x=1; x<=20; x+=2){
		for(x=2; x<=20; x+=2) {
			sum += x;
			System.out.println("x: "+x);
//			System.out.println("x�ݺ��� �ѹ��� �����Ŀ� for loopŻ��");
		}
		System.out.println(sum);
	}

}
