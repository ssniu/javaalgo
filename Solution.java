package ssn.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {


public static void main(String[] args){
	//Prompt the user enter correct input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of lines in the bill string");
    int N = input.nextInt();
    
    System.out.print("Please enter the phone bill content by following the format" +
       "each line is a record: " +"(eg: 00:10:20,122-456-780)\n");
    String[] S = new String[N];
    for(int i = 0; i < N; i++){
    S[i] = input.next();
    }
   
    ArrayList<String> lines = new ArrayList<>();
    for(int i = 0; i < N; i++){
        lines.add(eachLine[i]);
    }
    for(int i = 0; i < N - 1; i++){
    	for(int j = 1; j < N; j++)
    String s1 = lines.get(i).split(",")[1];
    	String s2 = lines.get(j).split(",")[1];	
    if(s1.equals(s2){
    	addTimes(lines.get(i).split(",")[0],lines.get(j).split(",")[0]);
    	lines.remove(i);
    }
    }
    /* print the string s[]
    for(String s: S)
        System.out.println(s);
        */
    
    //char endOfLine = 10;
    //for(String eachLine: S.split("\n")){
      //System.out.println(eachLine);
    //}
    
    // 2-d array to store the duration and number
    /*String[][] bill= new String[N][2];
    for(int i = 0; i < S.length; i++){
    	bill[i] = S[i].split(",");
    }*/
    
    //System.out.print(bill[0][1]);
   int sum = 0;
    for(int i = 0; i < N; i++){
    	int t = solution2(lines.get(i).split(",")[0]))
        sum += solution3(t);
   }
    System.out.println(sum);
    
   /*public static String solution1(String s){
	   String[] allString = s.split(",");
	   String dur= allString[0];
	   String num = allString[1];
	   return dur + "\n" + num;
   }*/

 public static int solution2(String s){
	  String[] times=s.split(":");
	  int hours = Integer.parseInt(times[0]);
	  int mins = Integer.parseInt(times[1]);
	  int secs = Integer.parseInt(times[2]);
	  int totalSec = (hours * 60 + mins * 60 + secs);
	  return totalSec;
	  
  }
 
  public static int solution3(int seconds){
	  int totalPay = 0;
	  if(seconds < 300) 
			  totalPay = seconds * 3;
	  else if(seconds / 60 == 5)
			  totalPay = (seconds / 60) * 150;
	  else 
			  totalPay = (seconds / 60 + 1) * 150;
			  
	  }
	  return totalPay;
  }
  
  
 
  /*
  public static int maxDuration(int[] times){
	  int max = times[1];
	  for(int i = 1; i < times.length; i++){
		  if(times[i] > max) 
			  max = times[i];
	  }
	  return max;
  }*/
  
  /*public static boolean isMax(int[] arr){
	  
  }
  */
  public static String addTime(String s1, String s2){
	  String[] times1=s1.split(":");
	  String[] times2=s2.split(":");
	  int hoursT = Integer.parseInt(times1[0])+Integer.parseInt(times2[0]);
	  int minsT = Integer.parseInt(times1[1]) + Integer.parseInt(times2[1]);
	  int secsT = Integer.parseInt(times1[2]) + Integer.parseInt(times2[2]);
	  return hoursT+":"+minsT+":" +secsT;
  }
}


