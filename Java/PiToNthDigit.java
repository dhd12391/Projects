/*****************************************************
  Project: **Find PI to the Nth Digit**
  Author: David Hua (Github: dhd12391)
  Date: 8/25/14
  Description: Enter a number and have the program generate PI up to that many decimal places. 
			   Keep a limit to how far the program will go.   
  Program Details: If program is run on command prompt, user can input an integer >= 0 
				   as the first argument N in order for the program to run.
				   Else, program will prompt user to do so during execution.
  Assumption: When N = 0, result is 3.0; When N = 1, result is 3.1; When N = 2, result is 3.14; etc.				   
******************************************************/
import java.math.*;;
import java.util.Scanner;
import java.io.IOException;

public class PiToNthDigit{
	public static void main(String[]args) throws IOException{
		final double PI = Math.PI;
		double piToNthDigit = 0.0;	
		Scanner input = new Scanner(System.in);
		int N;
		
		try{
			N = Integer.parseInt(args[0]); //digit limit	
			
		}catch(NumberFormatException e){
			System.out.println("ERROR: The argument given is not an Integer.");
			return;
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("Please provide an Integer as an argument for the program: ");
			try{
				N = input.nextInt();
				
			}catch(NumberFormatException ex){
				System.out.println("ERROR: The argument given is not an Integer.");
				return;
			}
		}
		
		if(N < 0){
			System.out.println("ERROR: The number given is a negative number");
			return;
		}

		else{
			piToNthDigit = ( Math.floor(PI * Math.pow(10, N)) ) / Math.pow(10, N);
			System.out.println( "Pi with " + N + " decimal places is: " + piToNthDigit);
		}
		//e.g. For N=3: 3.1415... * (10 ^ 3) = 3141.5... ;
		//Math.floor() -> 3141.5 becomes 3141.0; 3141.0 / 10^3 = 3.141		

	}	
}