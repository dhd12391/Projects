/*****************************************************
  Project: **Find PI to the Nth Digit**
  Author: David Hua (Github: dhd12391)
  Date: 8/25/14
  Details: If program is run on command prompt, user must input an integer greater
	       than zero as the first argument N in order for the program to run
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
		if( N >= 0 ){ //if N == 0, return 0.0; 
			piToNthDigit = (double) ((int) (PI * Math.pow(10, N-1) )) / Math.pow(10, N-1);
			System.out.println( "Pi with " + N + " digits is: " + piToNthDigit);
		}
		//e.g. For N=3: 3.1415... * (10 ^ 2) = 314.15... ; int casting -> 314.15... becomes 314;
		//double casting -> 314 becomes 314.0; 314.0 / 10^2 = 3.14		
		
		//System.out.println("PI is " + PI); // DEBUG STATEMENT, CHECKING FOR PI
	
	}	
}