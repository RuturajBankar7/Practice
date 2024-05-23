package com.abstraction;


//if the method is abstract then the class of that method should compulsorily abstract
//class which declare as a abstract not necessary it must have abstract method but if you declare method as abstract then class must be abstract class 
/*the method you are abstracting in the parent class must be implemented in the child class*/
//we can't create object of abstract class

abstract class Animal
{
	abstract void soundOfAnimal();//abstract method
	abstract void hairOfAnimal();
	abstract void colorOfAnimal();
	
	void typeOfAnimal()//concrete method
	{
		
	}
	
}

class Cat extends Animal
{

	@Override
	void soundOfAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void hairOfAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void colorOfAnimal() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dog extends Animal
{

	@Override
	void soundOfAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void hairOfAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void colorOfAnimal() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractionDemo1 {

	public static void main(String[] args) {
		

	}

}
