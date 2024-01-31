package lab9;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(20);
		hs.add(20);
		hs.add(25);
		
		System.out.println(hs);
		if (hs.contains(10)) {
            System.out.println("Set contains the number 10.");
        } else {
            System.out.println("Set does not contain the number 10.");
        }

      
		hs.remove(15);

  
        System.out.println("Size of the set: " + hs.size());
        System.out.println(hs);
	}

}
