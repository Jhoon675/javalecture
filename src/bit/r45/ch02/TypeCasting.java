package bit.r45.ch02;

// 이것이 자바다 51p

public class TypeCasting {

	public static void main(String[] args) {
		
		byte b1 = 10;
		int a = b1;  // int <- byte
//		System.out.println(in);
		
		char ch1 = '가';
		a = ch1;     // int <- char
		System.out.println("가의 유니코드=" + a);

		//
		a = (int)b1;
		
		checkvalefefore();
		
	}
	// 54p
	
	public static void checkvalefefore() {
		int i = 128;
		
		if ((i < Byte.MAX_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("Cant cast to byte");
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
	}
	
}
