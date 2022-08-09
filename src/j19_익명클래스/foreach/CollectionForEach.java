package j19_익명클래스.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionForEach {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 26; i++) {
			strList.add(Character.toString((char) (97 + i)));
		}
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		Consumer<String> consumer = str -> {
			System.out.println(str);
		};
		
		strList.forEach(consumer);
		
		System.out.println("=================================");
		
		Set<String> strSet = new HashSet<String>();
		
		for(int i = 0; i < 26; i++) {
			strSet.add(Character.toString((char) (97 + i)));
		}
		
		for(String str : strSet) {
			System.out.println(str);
		}
		
		strSet.forEach(str -> {System.out.println(str);});
		
		System.out.println("===================================");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < 26; i++) {
			map.put(Character.toString((char) (97 + i)), 97 + i);
		}
		
		map.forEach((k, v) -> {
			System.out.print("key: " + k);
			System.out.print(", ");
			System.out.println("value: " + v);
		});
		

	}

}





