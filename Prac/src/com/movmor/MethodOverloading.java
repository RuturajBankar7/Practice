package com.movmor;

//method overloading is more than one method with same name with different parameters in the same class

public class MethodOverloading {
	
	int result,a,b;
	
	void add(int a, int b)
	{
		result=a+b;
		System.out.println(result);
	}
	
	void add(int a, int b, int c)
	{
		float result=a+b+c;
		System.out.println(result);
	}
	
	public void add(float a, int b, int c)
	{
		float result=a+b+c;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.add(1.1f, 0, 0);
		mo.add(0, 0, 0);

	}

}
