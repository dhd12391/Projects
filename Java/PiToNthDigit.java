import java.math.*;;

public class PiToNthDigit{
	public static void main(String[]args){
		int N = Integer.parseInt(args[0]); //digit limit
		final double PI = Math.PI;
		double piToNthDigit = 0.0;

		if( N >= 0 ){ //if N is not 0 or greater, or is not an integer, return 0.0
			piToNthDigit = (double) ((int) (PI * Math.pow(10, N-1) )) / Math.pow(10, N-1); 
		}
		//e.g. N=3 -> 3.1415 * (10 ^ 2) = 314.15 ; int casting -> 314.15 becomes 314;
		//double casting -> 314 becomes 314.0; 314.0 / 10^2 = 3.14

		System.out.println( "Pi with " + N + " digits is: " + piToNthDigit);
	}	
}