package Day8Assignment;

import java.util.Scanner;

public class MathematicalFunctionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Qestion: area = squareroot/sqrt (s*(s-a)*(s-b)*(s-c))
		
		// s = semi-perimeter, and a, b and c are sides of the triangle
		// Formula of s = (a+b+c)2
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter a= ");
	double a = input.nextDouble();
	
	System.out.println("Enter b= ");
	double b= input.nextDouble();
	
	System.out.println("Enter C= ");
	double c = input.nextDouble();
	
	double s= (a+b+c)/2;
	
	double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
	System.out.println("area: "+area);
	
	
		
		
		
	}

}