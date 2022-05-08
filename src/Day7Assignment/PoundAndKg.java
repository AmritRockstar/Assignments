package Day7Assignment;

import java.util.Scanner;

public class PoundAndKg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9.	Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, \n
		//converts it to kg and displays the result [1 pound is 0.454 kg].
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter pound: ");
		
		double pound = input.nextInt();
		
		double kg = pound*0.454;
		
		System.out.println("kg is given pound mulitply by 0.454:  "+kg);
		
		
	}

}
