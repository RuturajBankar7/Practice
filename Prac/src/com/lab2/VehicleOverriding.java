package com.lab2;

class Vehicle 
{
    public void startEngine() 
    {
        System.out.println("Engine started.");
    }

    public void stopEngine() 
    {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle 
{
    public void startEngine()
    {
        System.out.println("You can start the car engine with the start button.");
    }

    public void stopEngine() 
    {
        System.out.println("You can stop the car engine by pushing the same start button while engine is on.");
    }
}

class Motorcycle extends Vehicle
{
    public void startEngine() {
        System.out.println("You can start the motorcycle engine by applying clutch and clicking start button at the same time.");
    }
    
    public void stopEngine() 
    {
        System.out.println("You can stop the motorcycle engine by moving the key in anti-clockwise direction.");
    }
}

public class VehicleOverriding {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		v.startEngine();
		System.out.println("---------------------");
		v.stopEngine();
	
		System.out.println("_____________________________________________________________________________________________________________");
		
		Car c=new Car();
		c.startEngine();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		c.stopEngine();
		
		System.out.println("_____________________________________________________________________________________________________________");
		
		Motorcycle m=new Motorcycle();
		m.startEngine();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		m.stopEngine();
		
		System.out.println("_____________________________________________________________________________________________________________");
		
		Vehicle vc=new Car();//upcasting
		vc.startEngine();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		vc.stopEngine();
		
		System.out.println("_____________________________________________________________________________________________________________");
		
		Vehicle vm=new Motorcycle();
		vm.startEngine();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		vm.stopEngine();
		
		
		
	}

}
