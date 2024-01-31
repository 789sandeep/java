package collection_framework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(23);
		arr.add(34);
		arr.add(66);
		arr.add(null);
		arr.add(null);
		System.out.println(arr);
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("hello");
		ts.add("how");
		ts.add("are");
		ts.add("you");
//		ts.addAll(arr);
		
		System.out.println(ts);
		
		int arr1[]= {1,2,45,6};
		for(int ar:arr1) {
			arr.add(ar);
		}
		
		
		

	}

}
