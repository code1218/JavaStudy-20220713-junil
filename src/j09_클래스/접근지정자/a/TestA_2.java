package j09_클래스.접근지정자.a;

public class TestA_2 {
	int ta2;
	
	public TestA_2() {
		// TODO Auto-generated constructor stub
	}
	
	public void testA2() {
		System.out.println("TestA-2 메소드 호출");
		System.out.println();
		
		TestA testA = new TestA();
		//testA.ta1 = "테스트A-2에서 값 주입";
		testA.testA1();
		//System.out.println(testA.ta1);
	}
}
