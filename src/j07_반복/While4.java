package j07_반복;

public class While4 {

	public static void main(String[] args) {
		int dan = 2;
		
		int i = 0;
		while(i < 9) {
			int num = i + 1;
			
			System.out.println(dan + " x " + num + " = " + (dan * num));
			i++;
		}
		
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 */
	}

}
