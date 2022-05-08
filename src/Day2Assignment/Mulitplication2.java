package Day2Assignment;

import java.util.Scanner;

public class Mulitplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = input.nextInt();
		System.out.println("Enter number2: ");
		int number2 = input.nextInt();
		
		int mul = number1*number2;
		
		System.out.println("Answer: "+mul);
		System.out.println("Multiplication of number1 and number2 is: "+mul);
		System.out.println("Multiplication of " +number1 + " and " +number2 +" is: "+mul);
		
		input.close();
	}

}
