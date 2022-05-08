package Day6Assignment;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class RadiusAndLengthOfACylinderWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter radius: ");
		
		int radius = input. nextInt();
		
		System.out.println("Enter length: ");
		
		int length = input. nextInt();
		
		double  pi= Math.PI;
		
		double volume = pi*radius*radius*length;
		
		System.out.println("Volume of Cylinder: " +volume);
		System.out.println("Volume of Cylinder is "+ "Value of pi" + " multiply square of " +radius +" and multiply by " + length +" is: " +volume);
		
	
		
		
		
		
	}

}
