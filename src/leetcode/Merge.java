package leetcode;

import java.util.Arrays;

public class Merge {
    public static void merge(int arr[], int arr2[]) {
    	for(int j=0,i=arr.length;j<arr2.length; j++) {
    		arr[i]=arr2[j];
    		i++;
    	}
    	Arrays.sort(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		int arr2[]= {2,5,6};
	    merge(arr,arr2);
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);
	    }

	}

}
