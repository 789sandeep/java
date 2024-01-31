package leetcode;

import java.util.HashMap;

public class Findcommonelementsbetweentwoarray {
    public static int[] commonelement(int nums1[],int nums2[]) {
    	
    	HashMap<Integer,Integer> count1=new HashMap<>();
    	HashMap<Integer,Integer> count2=new HashMap<>();
    	for(int num:nums1) {
    		if(count1.containsKey(num)) {
    			count1.put(num,count1.get(num)+1);
    		}
    		else {
    			count1.put(num,1);
    		}
    	}
    	for(int num:nums2) {
   		 if(count2.containsKey(num)) {
   			 count2.put(num,count2.get(num)+1);
   		 }
   		 else {
   			 count2.put(num,1);
   		 }
   	 }
    	int s1=0;
    	int s2=0;
    	 for (int number : count1.keySet()) {
    		    int c=count1.get(number);
    		    for(int number1:count2.keySet()) {
    	    		 int c1=count2.get(number1);
    	    		 if(number==number1) {
    	    			 s1+=c;
    	    			 s2+=c1;
    	    		 }
    	    	 }
                
         }

    
    	 int []ans=new int[2];
    	 ans[0]=s1;
    	 ans[1]=s2;
    	 
    	
		return ans;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1= {4,3,2,3,1};
		int []nums2= {2,2,5,2,3,6};
		
		int []result=commonelement(nums1,nums2);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}

}
