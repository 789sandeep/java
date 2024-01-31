package lab4;
class Student{
	 String name ;
	 int age;
	 String department;
	 
	 public Student() {
	        this.name = "Unknown";
	        this.age = 20;
	        this.department = "Unassigned";
	    }

	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.department = "CS";
	    }

		public Student(String name, int age, String department) {
			super();
			this.name = name;
			this.age = age;
			this.department = department;
		}

		public String getName() {
			return name;
		}


		public int getAge() {
			return age;
		}

		public String getDepartment() {
			return department;
		}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student st=new Student("yash", 25);
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getDepartment());
        
	}

}
