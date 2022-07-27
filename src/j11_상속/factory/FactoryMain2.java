package j11_상속.factory;

public class FactoryMain2 {
	
	public static void main(String[] args) {
		//업캐스팅
		Factory factory1 = new SamsungFactory(1);
		Factory factory2 = new LGFactory(1);
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		System.out.println("모든 공장을 가동합니다.");
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		
		System.out.println();
		
		System.out.println("모든 공장을 중지합니다.");
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
		
		
		
	}
}








