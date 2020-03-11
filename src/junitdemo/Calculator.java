package junitdemo;

public class Calculator {
	public double add(double a,double b){
		return (a+b);
	}
	public double subtract(double a,double b){
		return (a-b);
	}
	public double multiply(double a,double b){
		return (a*b);
	}
	public double divide(double a,double b){
		if(b==0){
			throw new ArithmeticException("Error: Attempting to dividew by zero");
		}
		return (a/b);
	}

	public static void main(String [] args) {
		Calculator c=new Calculator();
		c.add(1.2, 3.5);
		c.subtract(5.7, 4);
		c.multiply(3.5,6.7);
		c.divide(10, 2);
		
	}
}
