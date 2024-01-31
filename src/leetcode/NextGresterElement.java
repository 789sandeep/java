package leetcode;

public class NextGresterElement {
    public static int[] nextgreaterelement(int  nums1[], int  nums2[]) {
    	int as= nums1.length;
    	int []narr=new int[as];
    	for(int i=0; i<as; i++) {
    		for(int j=0; j<nums2.length-1; j++) {
    			if(nums1[i]==nums2[j] && nums2[j+1]>nums2[j]) {
    				  narr[i]=nums2[j+1];
   
    			}
    		}
    		if(narr[i]==0) {
    			narr[i]=-1;
    		}
    	}
    	return narr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,3,5,2,4};
		int[] nums2= {6,5,4,3,2,1,7};
		
		int []ans=nextgreaterelement( nums1, nums2);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
