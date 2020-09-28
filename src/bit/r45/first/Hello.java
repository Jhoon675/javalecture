package bit.r45.first;

import java.io.IOException;

import bit.r45.members.*;
import bit.r45.first.Student; 

public class Hello 
{	
	public static void main(String[] args) 
	{
		/* 
		 * // 이름이 같은 파일을 쓸때는 헷갈리지 않도록 풀네임을 명시해준다. bit.r45.members.Student student;
		 * bit.r45.first.Student student1;
		 * 
		 * student = new Student();
		 * 
		 * // try { // System.in.read(); // } catch (IOException e) { // // TODO
		 * Auto-generated catch block // e.printStackTrace(); // }
		 * 
		 * System.out.println("헬로~~~~~");
		 * 
		 * System.err.println("에러!!!");
		 */
		 
		Student student; // 자료형을 선언
		
		student = new Student(); // class는 new를 사용하여 할당한다.
		student.run();
		student.setAge(100);
		student.run();
		
	}

	
	
	
	
	
}
