package calculator_APP;

import java.util.Scanner;

public class Calc {
	//Creating new scanner
	static Scanner usin = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Creating variables
		int y, x;
		
		//Receiving user input
		System.out.println("Enter the First number: ");
		x = usin.nextInt();
		System.out.println("Enter the Second Number to compute with the First Numeber: ");
		y = usin.nextInt();
		
		//Printing the sum, difference, multiple, divider, power, and log of the given numbers
		System.out.println("The sum of the Numbers: " + Integer.sum(y, x));
		System.out.println("The multiple of the Numbers: "+ Math.multiplyExact(x, y));
		System.out.println("The quotient of the Numbers (Without remainder): " + Math.floorDiv(x, y));
		System.out.println("The power of the Numbers: " + Math.pow(x, y));
		System.out.println("The log of the system: " + Math.log(x)/Math.log(y));
		
	}
}
