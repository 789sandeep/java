package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_integer {
 public static int rti(String s) {
	 
	 Map<Character,Integer> mp=new HashMap<>();
	 mp.put('I',1);
	 mp.put('V',5);
	 mp.put('X',10);
	 mp.put('L',50);
	 mp.put('C',100);
	 mp.put('D',500);
	 mp.put('M',1000);
	 
	 int ans=mp.get(s.charAt(s.length()-1));
	  
	 for(int i=s.length()-2; i>=0; i--) {
		    
		 if(mp.get(s.charAt(i))<mp.get(s.charAt(i+1))) {
			 ans-=mp.get(s.charAt(i));
			
			 
		 }
		 if(mp.get(s.charAt(i))>mp.get(s.charAt(i+1))) {
			 ans+=mp.get(s.charAt(i));
		 }
	 }
	 
	return ans;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MCMXCIV";
		System.out.println(rti(s));

	}

}
