package ssn.sort;



public class RandomTen {

	public static void main(String[] args) {
	
		
		int[] num = new int[100];
		int[] count = new int[10];
		for(int i = 0; i < num.length; i++){
			int n = (int)(Math.random() * 10);
			num[i] = n;
			count[n]++;
		}
		for(int i = 0; i < 100; i++){
			System.out.print(num[i] + " ");
			if((i + 1) % 10 == 0) System.out.println();
		}
		for(int i = 0; i < count.length; i++){
		System.out.println("Occurrence for " + i + " = " + count[i]);
	}

}
}
