package chap_05_01;

public class test {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 55, 67 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		System.out.println("scores[3] : " + scores[3]);
		System.out.println("scores[4] : " + scores[4]);
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);		
		double avg = (double) sum / 5.0;
		System.out.println("Æò±Õ : " + avg);
	}
}
