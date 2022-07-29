package j09_클래스3;

public class PersonMain {

	public static void main(String[] args) {
		String[] names = {"김준일", "서재효", "전나경"};
		int[] ages = {29, 25, 23};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i + 1 + "번 사람(이름): " + names[i]);
			System.out.println(i + 1 + "번 사람(나이): " + ages[i]);
		}
		
//		Person person1 = new Person("김준일", 29);
//		
//		person1.setName("김준일");
//		System.out.println(person1.getName());
		
		String name1 = "김준일";
		String name2 = "서재효";
		String name3 = "전나경";
		int age1 = 29;
		int age2 = 25;
		int age3 = 23;
		
		System.out.println("1번 사람(이름): " + name1);
		System.out.println("2번 사람(이름): " + name2);

		
	}

}
