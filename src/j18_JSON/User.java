package j18_JSON;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	/*
	 * serialize = 객체를 json으로 변환할 때
	 * deserialize = json을 객체로 변환할 때
	 */
	
	@Expose(serialize = true, deserialize = true)
	private int userCode;
	@Expose(serialize = true, deserialize = true)
	@SerializedName("userId")
	private String username;
	@Expose(serialize = false, deserialize = true)
	private String password;
	@Expose(serialize = true, deserialize = true)
	private String name;
	@Expose(serialize = true, deserialize = false)
	private String email;
	@Expose(serialize = true, deserialize = true)
	private String address;
	@Expose(serialize = true, deserialize = true)
	@SerializedName("phoneNumber")
	private String phone;
	@Expose(serialize = true, deserialize = true)
	private List<String> hobby;	

}





