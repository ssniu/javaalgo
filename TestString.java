package ssn.sort;

public class TestString {

	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");
		String c = new String("abc");
		
		System.out.println(a==b);
		System.out.println(c==b);
		System.out.println(c.equals(b));
		
		System.out.println(a.equals(b));
	}

}
