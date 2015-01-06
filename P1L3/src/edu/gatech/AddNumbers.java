package edu.gatech;

public class AddNumbers {
		
	public static void main(String[] args){
		
		//Parse two numbers from system args
		Integer a = Integer.parseInt(args[0]);
		Integer b = Integer.parseInt(args[1]);
		
		int sum = a+b;
		
		System.out.println(a + " + " + b + " = " + sum);
	
	}

}
