package sorting;

public class Main {

	public static int[] bubblesort(int []arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,12,3,13,4,45,787,23};
		bubblesort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
