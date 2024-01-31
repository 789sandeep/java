package class_practice;

public class Contiguous_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,7,6,9,-20};
		int k=3;
		int ans=0;
		for(int i=0; i<=arr.length-k; i++) {
			int prev=0;
			for(int j=i; j<k+i; j++) {
				prev+=Math.abs(arr[j]);
				if(prev>ans) {
					ans=prev;
				}
			}
			
		}
		

		
		
		System.out.println(ans);

	}

}
