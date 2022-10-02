public class sumSquareDifference {
	public static void main(String[] args) {
		
		//defining variables
		int sumSquare = 0;
		int squareSum = 0;
		int squareSumHold = 0; //holds the sum of the first natural numbers to then be squared
		int sumDifference = 0;
		final int FIRST_HUNDRED_NATURAL = 100;
		
		for (int i = 1; i <= FIRST_HUNDRED_NATURAL; i++) {
			sumSquare += Math.pow(i, 2); //squaring natural numbers to arrive at the sum of squares
			System.out.println(sumSquare);
		}
		System.out.println("================");
		
		for (int j = 1; j <= FIRST_HUNDRED_NATURAL; j++) {
			squareSum += j; //adding natural numbers
			System.out.println(squareSum);
		}
		squareSumHold += squareSum * squareSum; //after adding natural numbers, number must be squared
		sumDifference = squareSumHold - sumSquare; //difference between the sum of the squares of the 
													//natural numbers and the square of the sum
		
		System.out.println("\n" + squareSumHold);
		System.out.println("\n" + sumDifference);
	}
}