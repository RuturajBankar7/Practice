package com.lab2;

class Sports
{
	public void play()
	{
		System.out.println("Playing Sport");
	}
}

class Football extends Sports
{
	public void play()
	{
		System.out.println("Playing Football");
	}
}

class Basketball extends Sports
{
	public void play()
	{
		System.out.println("Playing Basketball");
	}
}

class Rugby extends Sports
{
	public void play()
	{
		System.out.println("Playing Rugby");
	}
}

public class SportsOverride 
{

	public static void main(String[] args) 
	{
		
		Sports s=new Sports();
		s.play();
		
		System.out.println();
		
		Football f=new Football();
		f.play();
		
		System.out.println();
		
		Basketball b=new Basketball();
		b.play();
		
		System.out.println();
		
		Rugby r=new Rugby();
		r.play();
		
		System.out.println();
		
		Sports sf=new Football();//upcasting
		sf.play();
		
		System.out.println();
		
		Sports sb=new Basketball();//upcasting
		sb.play();
		
		System.out.println();
		
		Sports sr=new Rugby();//upcasting
		sr.play();
		
	}

}
