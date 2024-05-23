package com.abstraction;

//in abstract class we can mention constructor and if we not do that then there is a default one/
//we can not create abstract method as a static or private

abstract class Employee
{
	int id;
	
	Employee()
	{
		
	}
	
	Employee(int a)
	{
		
	}
	
	abstract void salary();
	abstract void leave();
	
	void show()
	{
		System.out.println("All employee");
	}
}

class Permanent_Employee extends Employee
{

	@Override
	void salary() {
		System.out.println("Bonus + HRA");
		
	}

	@Override
	void leave() {
		System.out.println("24");
		
	}
	
}

class Temporary_Employee extends Employee
{

	@Override
	void salary() {
		System.out.println("Overtime + HRA");
		
	}

	@Override
	void leave() {
	System.out.println("20");
		
	}
	
}
public class AbstractionDemo2 {

	public static void main(String[] args) {
		
		//Employee em=new Employee();//we can not create a object of abstract class
		
		Permanent_Employee pe=new Permanent_Employee();
		pe.salary();
		pe.leave();
		pe.show();//child class object calling parent class method because we can't create object of parent class since it is abstract one
		
	}

}
