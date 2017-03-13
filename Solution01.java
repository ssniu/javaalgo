package ssn.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution01 {


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
        lines.add(S[i]);
    }
    
    for(int i = 0; i < N - 1; i++){
    	for(int j = 1; j < N; j++)
        
    if(lines.contains(lines.get(j).split(",")[1])){
    	addTimes(lines.get(i).split(",")[0],lines.get(j).split(",")[0]);
    	lines.remove(i);
     }
    int[] times = new int[N];
    times[i] = totalDuration(lines.get(i).split(",")[0]);
    
    if(totalDuration(lines.get(i).split(",")[0]) == maxDuration(times)){
    	lines.remove(i);
     }
    }
   int sum = 0;
    for(int i = 0; i < N; i++){
    	int t = totalDuration(lines.get(i).split(",")[0]);
        sum += totalAmount(t);
   }
    System.out.println(sum); 
   
}


public static int maxDuration(int[] times){
	  int max = times[1];
	  for(int i = 1; i < times.length; i++){
		  if(times[i] > max) 
			  max = times[i];
	  }
	  return max;
}

public static String addTimes(String s1, String s2){
	  String[] times1=s1.split(":");
	  String[] times2=s2.split(":");
	  int hoursT = Integer.parseInt(times1[0])+Integer.parseInt(times2[0]);
	  int minsT = Integer.parseInt(times1[1]) + Integer.parseInt(times2[1]);
	  int secsT = Integer.parseInt(times1[2]) + Integer.parseInt(times2[2]);
	  return hoursT+":"+minsT+":" +secsT;
}
public static int totalDuration(String s){
	  String[] times=s.split(":");
	  int hours = Integer.parseInt(times[0]);
	  int mins = Integer.parseInt(times[1]);
	  int secs = Integer.parseInt(times[2]);
	  int totalSec = (hours * 60 + mins * 60 + secs);
	  return totalSec;
	  
}

public static int totalAmount(int seconds){
	  int totalPay = 0;
	  if(seconds < 300) 
			  totalPay = seconds * 3;
	  else if(seconds / 60 == 5)
			  totalPay = (seconds / 60) * 150;
	  else 
			  totalPay = (seconds / 60 + 1) * 150;
			  
	  return totalPay;
 }
}


