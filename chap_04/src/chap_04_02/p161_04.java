package chap_04_02;

public class p161_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				int z = (4*x)+(5*y);
				if(z==60) {
					System.out.println("("+ x +","+ y +")");
				}
				
			}
			
		}
		
	}

}
