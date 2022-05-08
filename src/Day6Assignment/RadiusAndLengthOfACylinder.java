package Day6Assignment;

import java.util.Scanner;

public class RadiusAndLengthOfACylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*7.	Write a program that reads the radius and length of a cylinder and computes volume
		 * Formula, Volume = PI *r^2*l [l= length/height, r= radius, v= volume]
		 */
Scanner input = new Scanner (System.in);

int height = 40;
int radius = 16;

double pi= Math.PI;

double volume = pi*(radius*radius)*height;

System.out.println("volume: "+volume);
	
input.close();
	}

}
