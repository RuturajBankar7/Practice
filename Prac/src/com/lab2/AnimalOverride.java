package com.lab2;

class Animal 
{
     public void move()
    {
        System.out.println("Animal moves");
    }

    public void makeSound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal 
{
    public void move() 
    {
        System.out.println("Bird flies");
    }

    public void makeSound() 
    {
        System.out.println("Bird whistles");
    }
}


class Panthera extends Animal 
{
    public void move() 
    {
        System.out.println("Panthera walks");
    }
  
    public void makeSound() 
    {
        System.out.println("Panthera roars");
    }
}

public class AnimalOverride 
{

	public static void main(String[] args) 
	{
		Animal an=new Animal();
		an.move();
		an.makeSound();
		
		System.out.println();
		
		Bird b=new Bird();
		b.move();
		b.makeSound();
		
		System.out.println();
		
		Panthera p=new Panthera();
		p.move();
		p.makeSound();
		
		System.out.println();
		
		Animal anb=new Bird();//Upcasting
		anb.move();
		anb.makeSound();
		
		System.out.println();
		
		Animal anp=new Panthera();//Upcasting
		anp.move();
		anp.makeSound();

	}

}
