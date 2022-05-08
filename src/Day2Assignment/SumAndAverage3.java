package Day2Assignment;

import java.util.Scanner;

public class SumAndAverage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("Enter number1: ");
		double number1= input.nextInt();
		
		System.out.println("Enter number2");
		double number2 = input.nextInt();
		
		double sum = number1+number2;
		double avg = (number1 + number2)/2;
		
		System.out.println(sum);
		System.out.println("Addition of number1 and number2 is sum: " +sum);
		System.out.println("Addition of "+number1 +" and " +number2 +" is sum: " +sum);
		
		System.out.println(avg);
		System.out.println("Summation of number1 and number2 divided by 2 is: "+avg);
		System.out.println("Summation of " +number1 +" and " +number2 +" is avg:" +avg );
	}

}
