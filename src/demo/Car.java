package demo;

public class Car extends Vehicle //Vehicle:Base Class,Car:Child Class
{		//extends keyword is used for inheritance
	public Car(int a)
	{
		super(22);//for assign multiple values in parameterized constructor
		System.out.println("car Constructor");
		System.out.println(a);
	}
	public void Colour()
	{
		System.out.println("Car Colour Method");
	}
}
