package bit.r45.members;

// 클래스
public class Student {
	//전달 요소 String nam, int age
	
	// 클래스 안에는 멤버들이 와야 한다.
	// 멤버들: 필드(속성), 메서드(함수)
	// 필드의 값이 바뀌는 행위들 = 메서드
	
	/* 필드 */
	int age;
	int color; // 1: red, 2: blue, 3: bla ck
	
	/* run()이라는 메서드 */
	public void run() {
		// 1개의 구문은 1개의 문장만 쓸 수 있다.
		int x = 1; //변수 x를 선언하고 1을 저장
		int y = 2; //변수 y를 선언하고 2을 저장
		
		int result = x + y;
//		int
//		result
//		= x + y;
		// 여러줄에 걸쳐서 작성해도 상관은 없으나 2개 이상의 구문이 되면 안된다.
		
		System.out.println(x + "+" + y + "=" + result);
		System.out.println("Student AGE: " + this.age);
	}
	
	
	// this
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
