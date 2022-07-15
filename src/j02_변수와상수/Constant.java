package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER;
		final int MIN_NUMBER = 0;
		
		MAX_NUMBER = 100;
		
		int number = 10;
		number = 80;
		
		System.out.println("최소값: " + MAX_NUMBER);
		System.out.println("최대값: " + MIN_NUMBER);
		System.out.println("현재값: " + number);
		
		

	}

}
