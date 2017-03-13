package ssn.sort;

public class InsertionSort {
   public static int[] insertionSort(int[] list){
	   for(int i = 1; i < list.length; i++){
		   int k;
		   int current = list[i];
		   for(k = i - 1; k >= 0 && list[k] > current; k--){
			  
				   list[k+1] = list[k];
		   }
		   list[k+1] = current;
	   }
	   return list;
   }
   
   public static void main(String[] args){
	   int[] list1 = {8,3,6,1,5,9,2};
	   int[] list2=insertionSort(list1);
	   for(int i:list2)
		   System.out.print(i + " ");
   }
}
