package j07_반복;

public class For2 {

	public static void main(String[] args) {

		for(int i = 0; i < 8; i++) {
			int dan = i + 2;
			System.out.println(dan + "단");
			
			for(int j = 0; j < 9; j++) {
				int num = j + 1;
				System.out.println(dan + " x " + num + " = " + (dan * num));
			}
			
			System.out.println();
		}
		
		
		/*
		 * 2단
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 
		 * 3단
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * ...
		 * 3 x 9 = 27
		 * 
		 * ...
		 * 
		 * 9단
		 * 9 x 1 = 9
		 * 9 x 2 = 18
		 * ...
		 * 9 x 9 = 81
		 * 
		 */
	}

}
