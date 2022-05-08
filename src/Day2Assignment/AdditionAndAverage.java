package Day2Assignment;

import java.util.Scanner;

public class AdditionAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Write a program to find the sum and average of two numbers input by User (using Scanner class).
		
		//Question says to using scanner!, Pay attention
		
		//Scanner input = new Scnner(System.in)
				//Make sure "S" of Scanner should be capital
				//Hover over on Scanner and import "java.util.Scanner"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1= input.nextInt();
		System.out.println("Enter number2: ");
		int number2 = input.nextInt();
		
		
		
		int sum = number1 + number2, avg= (number1 + number2)/2;
		
		System.out.println(sum);
		System.out.println("Sum of number1 and number2:" +sum);
		System.out.println("Sum of " +number1 + " and " +number2 +" is: " + sum);
		
		System.out.println("====================================");
		System.out.println(avg);
		System.out.println("sum of number1 and number2 divided by 2: " +avg );
		System.out.println("sum of "+number1 + " and " + number2 + " divided by 2: " +avg);
		
	
		input.close(); // this is fix the yellow close error in line 18
	
		
				
				
				
				
				
		
		
	}

}
