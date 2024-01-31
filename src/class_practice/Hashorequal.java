package class_practice;

import java.util.Objects;

class Emp{
	private int emid;
	private String name;
	
	public int getEmid() {
		return emid;
	}
	public String getName() {
		return name;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int emid, String name) {
		super();
		this.emid = emid;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return emid == other.emid && Objects.equals(name, other.name);
	}
	
}
public class Hashorequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e=new Emp(1,"san");
		Emp e1=new Emp(2,"san");
		System.out.println(e.equals(e));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e.equals(e1));

	}

}
