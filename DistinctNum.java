package ssn.sort;

import java.util.Scanner;

public class DistinctNum {

	public static void main(String[] args) {
		
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter 10 numbers: ");
      int[] num = new int[10];
      
      int count = 0;
      
      for(int i = 0; i < 10; i++){
    	  int num1 = input.nextInt();
    	  
    	  if(isDistinct(num, num1))
    		  num[count++] = num1;  
      }
      System.out.println("The number of distinct number is " + count);
      
      for(int i = 0; i < count; i++){
    	  System.out.print(num[i] + " ");
      }
	}

	public static boolean isDistinct(int[] num, int num1) {
		for(int i = 0; i < num.length; i++){
			if(num[i] == num1) return false;
		}
		return true;
	}

}
