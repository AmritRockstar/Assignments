package Day7Assignment;

public class MathematicalFunctionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10.	Write a Program for the following Mathematical Function.
		// s= ut+1/2at^2
		// simplify it as : s= u*t+0.5*a*t*t 
		
		//Displacement (s) of an object equals, velocity (u) times time (t), plus ½ times acceleration (a) times time squared (t^2)
		
		double u= 50;
		double t= 12;
		double a = 9.8;
		
		double s = u*t +0.5 *a*t*t;
				System.out.println("s: "+s);
		
	}

}
