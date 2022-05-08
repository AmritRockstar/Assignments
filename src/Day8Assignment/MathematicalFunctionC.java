package Day8Assignment;

import java.util.Scanner;

public class MathematicalFunctionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//x= (-b+sqrtb^2-4ac)/2a [Quadratic Formula]
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a= ");
		double a = input. nextDouble();
		System.out.println("Enter b= ");
		double b= input.nextDouble();
		System.out.println("Enter c= ");
		double c= input.nextDouble();
		
		

		double x= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	
		System.out.println("Value of x: " +x);
		
		 input.close();
	}

}
