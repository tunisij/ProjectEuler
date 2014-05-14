package package1;

/**********************************************************************
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first 
 * ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first 
 * one hundred natural numbers and the square of the sum.

 * 
 * @author john
 * @version 12/26/13
 *********************************************************************/
public class Problem6 {
	long begin;
	long end;

	public int sum(int range){
		begin = System.currentTimeMillis();
		int sumSquares = 0;
		int squareSum = 0;
		for(int i = 1; i <= range; i++){
			sumSquares += (i * i);
			squareSum += i;
		}
		squareSum *= squareSum;
		end = System.currentTimeMillis();
		return squareSum - sumSquares;
	}
	
	public static void main(String[] args){
		Problem6 p = new Problem6();
		System.out.println(p.sum(10));
		System.out.println(p.end-p.begin + " ms\n");
		System.out.println(p.sum(100));
		System.out.println(p.end-p.begin + " ms");
	}
}
