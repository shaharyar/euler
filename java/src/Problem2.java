/**
 * Author: Faizan Shaharyar <faizan.shaharyar@gmail.com>
 * Date: 8/26/12
 * Time: 12:30 PM
 */
public class Problem2 {

	/*
	 *
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 *
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 */

	public static void main(String[] args) {

		int sumEvenFib = 0;

		for (int i = 0; i<50; ++i) {
			int fib = fib1(i);

			int upperBound = 4000000;
			if (fib < upperBound) {
				if (fib % 2 == 0) {
					sumEvenFib += fib;
				}
			} else {
				break;
			}
		}
		System.out.println(sumEvenFib);
	}

	public static int fib1(int n) {
		if (n == 1 || n == 0) {
			return n;
		} else {
			return fib1(n-1) + fib1(n-2);
		}
	}
}
