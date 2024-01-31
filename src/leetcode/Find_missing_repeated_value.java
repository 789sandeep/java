package leetcode;

import java.util.Vector;

public class Find_missing_repeated_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]arr= {{1,3},{2,2}};
		int size=arr.length*arr[0].length;
		Vector<Integer> vec=new Vector<>(size);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				vec.add(arr[i][j]);
			}
		}
	    
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(!vec.equals(arr[i][j])) {
					vec.removeElementAt(i);
				}
			}
		}
//		System.out.println(vec.equals(arr[0][0]));

	}

}