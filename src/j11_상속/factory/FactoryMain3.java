package j11_상속.factory;

public class FactoryMain3 {
	
	public static void main(String[] args) {
		//업캐스팅
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		int num  = 10;
		double dNum = num;
		
		System.out.println(dNum);
		
		int n = (int) dNum;
		
		
		double d = 3.14;	//Factory
		int i = (int) d;	//Factory -> SamsungFactory
		
		
		SamsungFactory sFactory = new SamsungFactory(1);
		Factory f = sFactory;
		
		System.out.println(f);
		
		
		Factory factory = new Factory(1);
		SamsungFactory samsungFactory = (SamsungFactory) factory;
		
	}
}








