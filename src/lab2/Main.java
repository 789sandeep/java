package lab2;

import java.util.Scanner;
class Car {
	private String make; 
	private String model;
	private short year;
	private int price;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car(String make, String model, short year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car() {}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("make"+" ");
		String make=sc.nextLine();
		
		System.out.println("model"+" ");
		String model=sc.nextLine();
		
		System.out.println("year"+" ");
		short year=sc.nextShort();
		
		System.out.println("price"+" ");
		int price=sc.nextInt();
		
		Car cr=new Car(make,model,year,price);
		System.out.println("Car Details:");
	    System.out.println("Make: " + cr.getMake());
	    System.out.println("Model: " + cr.getModel());
	    System.out.println("Year: " + cr.getYear());
	    System.out.println("Price:" + cr.getPrice());
	}

}
