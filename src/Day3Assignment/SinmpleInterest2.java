package Day3Assignment;

import java.util.Scanner;

public class SinmpleInterest2 extends SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100

		Scanner input = new Scanner(System.in);
		System.out.println("Enter P:");
		double P = input.nextDouble();
		System.out.println("Enter T: ");
		double T= input.nextDouble();
		System.out.println("Enter R: ");
		double R = input.nextDouble();
		
		double I = (P*T*R)/100;
		
		System.out.println("Simple Interest I; " + I);
		

		
	}

}
