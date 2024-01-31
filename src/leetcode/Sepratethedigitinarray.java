package leetcode;

import java.util.ArrayList;

public class Sepratethedigitinarray {
    public static int[] sepratethedigitinarray(int nums[]) {
    	ArrayList<Integer> sp=new ArrayList<>();
    	for(int i=0; i<nums.length; i++) {
    		String s=String.valueOf(nums[i]);
    		for(int j=0; j<s.length();j++) {
    			char c=s.charAt(j);
    			int v=Character.getNumericValue(c);
    			System.out.println(v);
    			sp.add(v);
    		}
    	}
    	int ans[]=new int[sp.size()];
    	for(int i=0; i<ans.length; i++) {
    		ans[i]=sp.get(i);
    	}
		return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums= {13,25,83,77};
		int []result=sepratethedigitinarray(nums);
		
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

}
