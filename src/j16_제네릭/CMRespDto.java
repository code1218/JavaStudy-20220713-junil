package j16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

// Commit Message Response Data Transfer Object
// 응답에 대한 완료 메세지를 담은 데이터의 변환 객체
// 공통 응답 객체
@AllArgsConstructor
@Data
public class CMRespDto<T> {
	private int code;
	private String message;
	private T data;
}
