package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '김';
		char name2 = '준';
		char name3 = '일';
		String name = "김준일";
		
		int age = 30;
		
		String address = "부산 동래구 사직동";
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();

		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		System.out.println();
	}

}
