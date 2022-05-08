package Day6Assignment;

import java.util.Scanner;

public class CelsiusAndFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
 *  Formula: C= (F-32)*5/9, F= C*9/5+32;
 */
	
 Scanner input = new Scanner (System.in);
 
 System.out.println("Enter Fahrenheit : ");
 float fahrenheit = input.nextInt();
 
 float celsius = (fahrenheit-32)*5/9;
 fahrenheit= (celsius*9/5)+32; // Dont type data type here like float or int because fahrenheit has already float data type up there in line 16
 
 System.out.println("celsius: "+celsius);
 System.out.println("When fahrenheit is "+fahrenheit +",  celsius is: " +celsius);
 
 System.out.println("fehrenheit is "+fahrenheit);
 
 System.out.println("==========================");
 
 input.close();
		 
		 
	}

}
