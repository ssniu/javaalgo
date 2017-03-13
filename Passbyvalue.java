package ssn.sort;

public class Passbyvalue {
   static public void main(String[] args){
	  int x = 1;
	  int y = 2;
	  swap(x,y);
	  System.out.println(x);
	  //short s1 = 1;
	  String m1 = "123";
	  int m = Integer.parseInt(m1);
	  System.out.println(m);
  }
  
  public static int swap(int x, int y){
	  int temp = x;
	  x = y;
	  y = temp;
	  return x;
  }	  
}
