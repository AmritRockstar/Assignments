package Day5Assignment;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		
	double radius,area;

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	
	radius = input.nextInt();
	input.close();
		area = Math.PI*radius*radius;
		System.out.println("Area of the circle is "+area);
	}

}
