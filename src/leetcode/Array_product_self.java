package leetcode;
class Solution{

	public int[] self(int[] arr) {
		int s=arr.length;
		int narr[]=new int[s];
		for(int i=0; i<arr.length; i++) {
			int ans=1;
			for(int j=0; j<arr.length; j++) {
				if(i==j) {
					continue;
				}
				else {
					ans*=arr[j];
				}
				
			}
			narr[i]=ans;
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=narr[i];
		}
		
		return arr;
		
		
	}
	
}
public class Array_product_self {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Solution s=new Solution();
		int arr[]= {1,2,3,4};
		
		s.self(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	

}
