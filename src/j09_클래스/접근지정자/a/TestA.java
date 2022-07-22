package j09_클래스.접근지정자.a;

public class TestA {

	private String ta1;
	
	void testA1() {
		System.out.println(this.ta1);
		System.out.println("TestA-1 메소드 호출");
		System.out.println();
	}
}
