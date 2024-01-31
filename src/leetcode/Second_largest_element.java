package leetcode;

public class Second_largest_element {
    public static int sle(int arr[], int s) {
    	int ans=0;
    	int largest=0;
        for(int i=0; i<s; i++) {
        	largest=Math.max(largest,Math.abs(arr[i]));
        }
        for(int j=0; j<s; j++) {
        	if(arr[j]!=largest) {
        		ans=Math.max(ans, Math.abs(arr[j]));
        	}
        }
        if(ans<0) {
        	return -1;
        }
        else {
        	return ans;
        }
		
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {-20, -30, 40, 25, 10};
        int s=arr.length;
        System.out.println(sle(arr,s));
	}

}
