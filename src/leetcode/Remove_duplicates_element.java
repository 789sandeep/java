package leetcode;

public class Remove_duplicates_element {
			public static int removeDuplicates(int[] nums) {
//				int count=0;
				int j=1;
				for(int i=1; i<nums.length;i++) {
					if(nums[i-1]==nums[i]) {
						nums[j]=nums[i];
//						count++;
						j++;
					}
				}
				
				return j;
        
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}

}
