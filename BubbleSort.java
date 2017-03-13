package ssn.sort;

public class BubbleSort {
 public static int[] bubbleSort(int[] list){
	 boolean nextPass= true;
	 for(int i = 1; i < list.length; i++){
		 nextPass = false;
		 for(int k = 0; k < list.length - i; k++){
			 if(list[k] > list[k+1]){
				 int temp = list[k+1];
				 list[k+1] = list[k];
				 list[k] = temp;
				 
				 nextPass = true;
			 }
		 }
	 }
	 return list;
 }
 
 public static void main(String[] args){
	 int[] list1 = {8,3,-1,3,7,4};
	 int[] list2 = bubbleSort(list1);
	 for(int i:list2)
		 System.out.print(i + " ");
 }
}
