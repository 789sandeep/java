package class_practice;

import java.util.Arrays;

public class Sum_equal_k {

	public static void main(String[] args) {
		
		
		int []arr= {1,2,0,4,1};
		int k=6;
		int result[]=Sum_of_equal(arr,k);
		if(result!=null) {
			System.out.println(result[0]+" "+result[1]);
		}
		else {
			System.out.println("No solution found.");
		}

	}

	private static int[] Sum_of_equal(int[] arr, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==k) {
				return new int[]{arr[i],arr[j]};
			}

			else if(arr[i]+arr[j]>k) {
				j--;
			}
			else {
				i++;
			}
				
		}
	   return null;
		
	}

}
