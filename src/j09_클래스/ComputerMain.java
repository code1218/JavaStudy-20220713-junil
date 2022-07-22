package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		
		Computer c2 = new Computer();		

		c1.cpu = "i7";
		c1.company = "SAMSUNG";
		c1.ram = 8;
		c1.year = 2022;
		c1.graphic = "RTX3060";
		
		c2.cpu = "i5";
		c2.company = "LG";
		c2.ram = 16;
		c2.year = 2021;
		c2.graphic = "GTX1080";
		
		
		c1.showInfo();
		c2.showInfo();
		c1.addRam(20);
		c1.showInfo();
		c2.removeRam(15);
		c2.showInfo();
		c2.removeRam(2);

	}

}







