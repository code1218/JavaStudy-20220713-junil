package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "김준일");
		jsonObject.addProperty("age", 29);
		jsonObject.addProperty("address", "부산 동래구 사직동");
		jsonObject.addProperty("phone", "010-9988-1916");
		
		String json = gson.toJson(jsonObject);
		
		System.out.println(json);
		System.out.println();
		
		System.out.println(jsonObject);
		
		JsonObject jsonObj = gson.fromJson(jsonObject, JsonObject.class);
		
		System.out.println(jsonObj);
	}

}






