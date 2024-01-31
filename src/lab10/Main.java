package lab10;

import java.util.HashMap;
import java.util.Map;


class Studentrecord{
	Map<String,Integer> student=new HashMap<>();
	
	public void studentadd(String name, int grade) {
		student.put(name, grade);
	}
	
	public void removestudent(String name) {
		if(student.containsKey(name)) {
		    int rgrade=student.remove(name);
			System.out.println(name+" romove student grade:"+rgrade);
		}
		else {
			System.out.println("student not found :"+name);
		}
	}
	public void displaygrade(String name) {
		if(student.containsKey(name)) {
		    int grade=student.remove(name);
			System.out.println(name+" student grade:"+grade);
		}
		else {
			System.out.println("student not found :"+name);
		}
	}
	
	public void displaystudentandgrade(){
		for(Map.Entry<String, Integer> entry:student.entrySet()) {
			System.out.println("Student name :"+entry.getKey()+""
					+ ",student grade :"+entry.getValue());
		}
	}
	
	public void calculategrade() {
		   if (!student.isEmpty()) {
	            int totalGrades = 0;
	            for (int grade : student.values()) {
	                totalGrades += grade;
	            }
//	            System.out.println(student.size());
	            double averageGrade = (double) totalGrades / student.size();
	            System.out.println("Average grade of all students: " + averageGrade);
	        } 
		   else {
	            System.out.println("No students in the map.");
	        }
		
	}

}

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentrecord st=new Studentrecord();
		st.studentadd("dip",23);
		st.studentadd("sav",20);
		st.studentadd("om",25);
		st.studentadd("alok",10);
		st.studentadd("sroy",50);
		st.displaystudentandgrade();
		System.out.println();
		st.removestudent("sav");
		st.removestudent("alok");
		System.out.println();
		st.displaygrade("om");
		st.displaygrade("sav");
		System.out.println();
		st.displaystudentandgrade();
		System.err.println();
		st.calculategrade();
		
		
		
		

	}

}
