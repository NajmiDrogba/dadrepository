package lab02;

import lab02.rounding.RoundingManager;

public class RoundingApplication 
{
	public static void main(String[] args)
	{
		//System.out.println("Rounding number to nearest decimal points");
		
		System.out.println("Main entry point of RoundingApplication");
		
		int divident = 200;
		int divisor = 357;
		RoundingManager roundManager = new RoundingManager();
		double value = roundManager.calculatePercentage(divident, divisor);
		
		System.out.println("Progress from "+divisor+"/"+ divident + "." + value + "%");
		
		int decimalPoints = 2;
		
		System.out.println("Round to " + decimalPoints + " decimal Points " + roundManager.roundValue(value, decimalPoints)+"%");
		
		decimalPoints = 0;
		System.out.println("Round to " + decimalPoints + " decimal Points " + roundManager.roundValue(value, decimalPoints)+"%");
		
	}

}
