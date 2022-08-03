package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		StaticTest.name = "김준일";
		StaticTest.printTest();
		
		
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "김준일";
		
		System.out.println(staticTest.name);
		staticTest.printTest();
//		
//		StaticTest staticTest2 = new StaticTest();
//		staticTest2.name = "김준이";
//		System.out.println(staticTest2.name);
//		
//		System.out.println(staticTest.name);
		
		

	}

}
