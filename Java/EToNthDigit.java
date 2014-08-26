/*****************************************************
  Project: **Find e to the Nth Digit**
  Author: David Hua (Github: dhd12391)
  Date: 8/26/14
  Description: Just like the previous problem, but with e instead of PI. 
			   Enter a number and have the program generate e up to that many decimal places. 
			   Keep a limit to how far the program will go.
 
  Program Details: If program is run on command prompt, user can input an integer >= 0 
				   as the first argument N in order for the program to run.
				   Else, program will prompt user to do so during execution.
  Assumption: When N = 0, result is 2.0; When N = 1, result is 2.7; When N = 2, result is 2.71; etc.				   
******************************************************/
import java.math.*;;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class EToNthDigit{
	public static void main(String[]args) throws IOException{
		final double E = Math.E;
		double eToNthDigit = 0.0;	
		Scanner input = new Scanner(System.in);
		int N;
		
		try{
			N = Integer.parseInt(args[0]); //digit limit	
			
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException: The argument given is not an Integer.");
			return;
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("Please provide an Integer as an argument for the program: ");
			try{
				N = input.nextInt();
		
			}catch(InputMismatchException ex){
				System.out.println("InputMismatchException: The argument given is not an Integer.");
				return;
			}
		}
		
		if(N < 0){
			System.out.println("ERROR: The number given is a negative number");
			return;
		}

		else{
			eToNthDigit = ( Math.floor(E * Math.pow(10, N)) ) / Math.pow(10, N);
			System.out.println( "e with " + N + " decimal places is: " + eToNthDigit);
		}
		//e.g. For N=3: 2.7182... * (10 ^ 3) = 2718.2... ;
		//Math.floor() -> 2718.2 becomes 2718.0; 2718.0 / 10^3 = 2.718		

	}	
}