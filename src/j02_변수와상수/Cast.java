package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
		double c = b;

		System.out.println(b);
		System.out.println(c);

		int d = (int) c;
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);

	}

}
