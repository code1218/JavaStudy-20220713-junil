package j11_상속.factory;

public class FactoryMain {
	
	public static void main(String[] args) {
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);
		
		LGFactory[] lgFactories = new LGFactory[3];
		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);
		
		Factory f = samsungFactories[0];
		
		System.out.println("삼성 공장 가동");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		
		System.out.println("삼성 공장 중지");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].stop();
		}
		
		System.out.println("LG 공장 가동");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		
		System.out.println("LG 공장 중지");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
	
	}
}








