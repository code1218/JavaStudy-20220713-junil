package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		((ClassA) new ClassB()).showData();
		
		ClassB bb = new ClassB();
		ClassA aa = bb;
		
		ClassA aaa = new ClassB();
		
		((ClassA) bb).showData();
		((ClassA) bb).printInfo();
		
		aa.showData();
		aa.printInfo();
		
		
		ClassA b = new ClassB();
		b.printInfo();
		b.showData();
		
		ClassA c = new ClassC();
		c.printInfo();
		c.showData();

	}

}
