package j07_반복.랜덤;

public class Random1 {
	
	public static void main(String[] args) {
		
		/*
		 * random 메소드
		 * 0 ~ 1 사이의 숫자를 실수형태로 랜덤하게 값을 만들어줌
		 * 
		 */
		
		int i = 0; 
		
		while(i < 10) {
			double rNum = Math.random();
			System.out.println((int) (rNum * 10));
			i++;
		}
		
		
		
		
	}
	
}
