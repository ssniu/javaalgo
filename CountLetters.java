package ssn.sort;

public class CountLetters {

	public static void main(String[] args) {
		String str = "Thewhalesarepartofthelargelyterrestrialmammalian";
			
		char[] chars = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		};
		
		int[] counts = countLetters(chars);
		
		displayCounts(counts);
	}

	public static void displayCounts(int[] counts) {
		for(int i = 0; i < counts.length; i++){
			if((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
		
	}

	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		for(int i = 0; i < chars.length; i++){
		   counts[chars[i] - 'a']++;   
		}
		return counts;
	}

}
