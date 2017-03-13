package ssn.sort;

import java.util.Scanner;

public class AverageOverload {

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    //Prompt the user to enter the 10 numbers
	    System.out.print("Enter tem double values: ");
	    double[] arr = new double[10];

	    // Input 10 numbers
	    for(int i = 0; i < 10; i++){
	      arr[i] = input.nextDouble();
	    }
	    
	    //Output the result of average value
	    System.out.println("The average of this array is: " + average(arr));
	    
	    System.out.print("Enter tem double values: ");
	    int[] arr1 = new int[10];

	    // Input 10 numbers
	    for(int i = 0; i < 10; i++){
	      arr1[i] = input.nextInt();
	    }
	    
	  //Output the result of average value
	    System.out.println("The average of this array is: " + average(arr1));
	  }
	  //Average method for integer array
	  public static int average(int[] array){
	    int total = 0;
	    int average = 0;
	    //Compute the average of integer array
	    for(int i = 0; i < 10; i++){
	      total += array[i];
	      
	    }
	    average = total / 10;
	    return average;
	  }
	  //Average method for double array
	  public static double average(double[] array){
	    double total = 0;
	    double average = 0;
	    //Compute the average value
	    for(int i = 0; i < 10; i++){
	      total += array[i];
	      average = total / 10;
	    }
	    return average;

	  }
	}

