package Day2Assignment;

import java.util.Scanner;

public class Division2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner yo = new Scanner(System.in); // "yo", you can put any word here as long as below name is matching
		System.out.println("Enter number1:");
		double number1 = yo.nextInt();
		System.out.println("Enter number2: ");
		double number2= yo.nextInt();
		
		double div = number1/number2;
		System.out.println("Answer is: " +div);
		System.out.println("number1 divided by number2 is: "+div);
		System.out.println("division of "+number1 +" by "+ number2 +" is: "+div);
		
	}

}
