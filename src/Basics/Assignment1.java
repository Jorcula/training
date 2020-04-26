package Basics;

public class Assignment1 {

	public static void main(String[] args) {

		// Write a function that takes a value n returns the sum of numbers 1 to n

		int iznos = returnSum(4);

		System.out.println(iznos);

		System.out.println(factorialValue(4));

		System.out.println(returnMinimum());

		System.out.println(returnMaximum());

		System.out.println(returnAverage());

	}

	public static int returnSum(int valueN) {
		int sum1 = 0;
		for (int i = 1; i <= valueN; i++) {
			sum1 = sum1 + i;
		}

		return sum1;
	}

	/*
	 * Write a function that computes the factorial value Definition: n! = n*(n-1)!
	 * , where 0! = 1 1! = 1 2! = 2 * 1! = 2 * 1 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 *
	 * 1 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1 Hint: use the
	 * recursive method that was used to calculate Fibonnaci number
	 */

	public static int factorialValue(int value) {

		int sum = 1;

		for (int i = 1; i <= value; i++) {
			sum = sum * i;

		}
		return sum;
	}

	/*
	 * Write 3 functions that take an array as a parameter and return the minimum,
	 * average, and maximum values of that array. Hint: this should be static
	 * functions with a return type of the same data type as the array declaration.
	 */

	public static int returnMinimum() {

		int[] myArray = new int[] { 2, 3, 4, 5, 6 };

		int min = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < min) {
				min = myArray[i];
			}
		}

		return min;

	}

	public static int returnMaximum() {

		int[] myArrayMax = new int[] { 3, 4, 22, 5, 6, 8, 10 };

		int max = myArrayMax[0];

		for (int i = 0; i < myArrayMax.length; i++) {
			if (myArrayMax[i] > max) {
				max = myArrayMax[i];
			}
		}
		return max;
	}

	public static double returnAverage() {

		int[] myArrayAverage = new int[] { 3, 4, 22, 5, 6, 8, 10 };

		double sum = 0;

		for (int i = 0; i < myArrayAverage.length; i++) {
			sum = sum + myArrayAverage[i];
		}
		System.out.println(sum);
		System.out.println(myArrayAverage.length);

		double average = sum / myArrayAverage.length;
		return average;
	}

}
