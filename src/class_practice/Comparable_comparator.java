package class_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Toroll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRollno()-o2.getRollno();
	}
	
}
class Toid implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
class Toname implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int marksc=Integer.compare(o1.getMarks(), o2.getMarks());
				
		if(marksc==0) {
			return o1.getName().compareTo(o2.getName());
		}
		return marksc;
	}
	
}
class Tomarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()-o1.getMarks();
	}
	
}
class Student implements Comparable<Student>{
	private String name;
	private int rollno;
	private int id;
	private int marks;
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public int getId() {
		return id;
	}
	public int getMarks() {
		return marks;
	}
	public Student(String name, int rollno, int id,int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.id = id;
		this.marks=marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", id=" + id + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
//		 return o.id-o.id;
		if(id==o.id) {
			return 0;
		}
		else if(id>o.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
}
public class Comparable_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st=new ArrayList<>();
		st.add(new Student("aash",2,1,10));
		st.add(new Student("azep",3,2,20));
		st.add(new Student("dzik",1,4,30));
		st.add(new Student("dzv",4,3,20));
		System.out.println(st);
//		this logic for comparable
//		Collections.sort(st);
//		System.out.println(st);
		
		//this logic for comparator
//		Collections.sort(st,new Toroll());
//		System.out.println(st);
		
//		Collections.sort(st,new Toid());
//		System.out.println(st);
		
//		Collections.sort(st,new Tomarks());
//		System.out.println(st);
		Collections.sort(st,new Toname());
//		System.out.println(st);
		for(Student st1:st) {
			System.out.println(st1);
		}
//		System.out.println(st);
		
		

	}

}
