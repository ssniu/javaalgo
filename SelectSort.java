package ssn.sort;

public class SelectSort {

	public static void main(String[] args) {
		int[] list = {9,3,5,1,6,8,2,4};
		insertionSort(list);
		for (int j = 0; j < list.length; j++) {
			System.out.print(list[j] + " ");
		}

	}
	
	public static void insertionSort(int[] list){
		for(int i = 1; i < list.length; i++){
			int current = list[i];
			int k;
			for(k = i - 1; k >= 0 && list[k] > current; k--){
				list[k + 1] = list[k];
			}
			list[k + 1] = current;
		}
	}

}

