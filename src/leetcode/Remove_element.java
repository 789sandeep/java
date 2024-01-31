package leetcode;

public class Remove_element {
	public static int removeElement(int[] nums, int val) {
        int count=0;
        int size=nums.length;
        for(int i=0; i<size; i++){
            if(val!=nums[i]){
            	nums[count]=nums[i];
                count++;
            }
        }
//        int ans=size-count;
//       System.out.println(count);
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,1,2,2,3,0,4,2}; 
		int val = 2;
		System.out.println(removeElement(nums,val));
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}

	}

}
