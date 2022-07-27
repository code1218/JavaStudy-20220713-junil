package j12_다형성.factory;

import java.util.Scanner;

import j11_상속.factory.Factory;
import j11_상속.factory.LGFactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Factory factory = null;
		
		String select = null;
		
		System.out.println("1. 삼성공장");
		System.out.println("2. LG공장");
		System.out.print("공장을 선택하세요: ");
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			factory = new SamsungFactory(1);
		}else {
			factory = new LGFactory(1);
		}
		
		FactoryService factoryService = new FactoryService(factory);
		
		factoryService.factoryStart();
		factoryService.factoryStop();

	}

}
