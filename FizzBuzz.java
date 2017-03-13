package ssn.sort;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		int i = 20;
		StringBuffer sb = new StringBuffer();
		
		for(int m = 0; m <= i; m++){
			if(m % 3 == 0 && m % 5 == 0)
				sb.append("fizzbuzz");
			else if(m % 3 == 0)
				sb.append("fizz");
			else if(m % 5 == 0)
				sb.append("buzz");
			else
				sb.append(m);
		}
		
		for(String n:sb)
			System.out.println(n);

	}

}
