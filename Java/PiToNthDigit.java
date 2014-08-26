/*****************************************************
  Project: **Find PI to the Nth Digit**
  Author: David Hua (Github: dhd12391)
  Date: 8/25/14
  Details: If program is run on command prompt, user can input an integer greater
	       than zero as the first argument N in order for the program to run.
		   Else, program will prompt user to do so during execution.
******************************************************/
import java.math.*;;
import java.util.Scanner;

public class PiToNthDigit{
	public static void main(String[]args){
		final double PI = Math.PI;
		double piToNthDigit = 0.0;	
		Scanner input = new Scanner(System.in);
		int N;
		
		try{
			N = Integer.parseInt(args[0]); //digit limit	
		}catch(NumberFormatException e){
			System.out.println("The argument given is not an Integer.");
			return;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide an Integer as an argument for the program.");
			try{
				N = input.nextInt();
			}catch(NumberFormatException ex){
				System.out.println("The argument given is not an Integer.");
				return;
			}
		}
		
		if(N < 0){
			System.out.println("The number given is a negative number");
			return;
		}
		
		//TODO: if N >= 10, piToNthDigit is overflowed due to exponent being very high
		//RESOLVE: Instead of using pow(), is there a way to chop the tail at a certain position?
		// 3.141592... - (3.141592... % pow(1,-(N-1))
		// e.g: N = 3 -> 3.1415 - (3.1415 % pow (1,-3)) = 3.1415 - (3.1415 % 0.01) = 3.1415 - 0.0015 = 3.1400
		if( N >= 0 ){ //if N == 0, return 0.0; 
			piToNthDigit = (double) ((int) (PI * Math.pow(10, N-1) )) / Math.pow(10, N-1);
			System.out.println( "Pi with " + N + " digits is: " + piToNthDigit);
		}
		//e.g. For N=3: 3.1415... * (10 ^ 2) = 314.15... ; int casting -> 314.15... becomes 314;
		//double casting -> 314 becomes 314.0; 314.0 / 10^2 = 3.14		
		
		//System.out.println("PI is " + PI); // DEBUG STATEMENT, CHECKING FOR PI
	
	}	
}