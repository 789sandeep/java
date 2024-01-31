package lab3;

import java.util.Scanner;

class Animal{
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("The dog makes a sound barks.");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("The Cat makes a sound meows.");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Animal animal=new Animal();
	    Dog dog=new Dog();
	    Cat cat=new Cat();
	    
	    System.out.print("Animal Sound :");
	    animal.makeSound();
	    
	    System.out.println("\nDog Sound:");
        dog.makeSound();
        
        System.out.println("\nCat Sound:");
        cat.makeSound();    
		
	}

}
