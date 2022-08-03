package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		strMap.put(10, "java1");
		strMap.put(20, "java2");
		strMap.put(30, "java3");
		strMap.put(40, "java4");
		
		System.out.println(strMap);
		
		strMap2.put("a", "python");
		strMap2.put("b", "python");
		strMap2.put("c", "python");
		strMap2.put("d", "python");
		
		System.out.println(strMap2);
		
		strMap.get(10);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
		
		strMap.entrySet().forEach(arg -> {
			System.out.println(arg);
			System.out.println(arg.getKey());
			System.out.println(arg.getValue());
		});
	}

}







