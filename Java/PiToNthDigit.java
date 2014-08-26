import java.math.*;;

public class PiToNthDigit{
	public static void main(String[]args){
		final double PI = Math.PI;
		double piToNthDigit = 0.0;		
		
		try{
			final int N = Integer.parseInt(args[0]); //digit limit

			if(N < 0){
				System.out.println("The number given is a negative number");
				return;
			}
			
			if( N >= 0 ){ //if N == 0, return 0.0
				piToNthDigit = (double) ((int) (PI * Math.pow(10, N-1) )) / Math.pow(10, N-1);
				System.out.println( "Pi with " + N + " digits is: " + piToNthDigit);
			}
			//e.g. N=3 -> 3.1415 * (10 ^ 2) = 314.15 ; int casting -> 314.15 becomes 314;
			//double casting -> 314 becomes 314.0; 314.0 / 10^2 = 3.14			
			
		}catch(NumberFormatException e){
			System.out.println("The argument given is not an Integer.");
			return;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide an Integer as an argument for the program.");
		}
	}	
}