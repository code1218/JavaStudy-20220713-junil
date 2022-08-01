package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor	// 기본생성자
@AllArgsConstructor	// 전체생성자
//@Setter	
//@Getter
//@EqualsAndHashCode
//@ToString
@Data
public class Student {
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
}







