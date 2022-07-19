package j06_조건;

public class If1 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작\n");

		boolean breakfast = false;
		boolean academy = false;

		if(breakfast) {
			System.out.println("밥을 차려 먹는다.");
			System.out.println("명령 하나 더 추가");
		}else {
			System.out.println("밥을 차려 먹지 않는다.");
		}

		if(academy) {
			System.out.println("가방을 챙긴다.");
		}else {
			System.out.println("가방을 챙기지 않는다.");
		}

		System.out.println("\n프로그램 종료");

	}

}
