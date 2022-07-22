package j07_반복;

public class Continue2 {

	public static void main(String[] args) {
		
		String address = "부산 동래구 사직동 중앙대로";
		String tempAddress = null;
		
		for(int i = 0; i < address.length(); i++) {
			String subaddress = address.substring(i, i + 1);
			if(subaddress.equals(" ")) {
				continue;
			}
			if(i == 0) {
				tempAddress = subaddress;
			}else {
				tempAddress += subaddress;				
			}
		}
		
		System.out.println(tempAddress);

	}

}
