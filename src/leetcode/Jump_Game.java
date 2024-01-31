package leetcode;

public class Jump_Game {
	private static boolean jump(int[] nums) {
		int jump=0;
		int count=0;
		for(int i=0; i<nums.length;i++) {
			if(jump<nums[i]) {
				jump=nums[i];
				System.out.print(jump+" ");
				if(jump<nums.length-1) {
					count++;
				}
			}
//			System.out.print(jump+" ");
			if(jump--==0) {
				return false;
			}
			
		}
		System.out.println(count);
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2};
		System.out.println(jump(nums));
	}

	

}
