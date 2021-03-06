package package1;

/**********************************************************************
 * Each new term in the Fibonacci sequence is 
 * generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do 
 * not exceed four million, find the sum of the even-valued terms.
 * 
 * 
 * @author john
 * @version 12/23/13
 *********************************************************************/
public class Problem2 {
	
	public int fib(int n){
		if(n < 3 && n > 0)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
	
	public int sum(int max){
		int sum = 0;
		for(int i=2; fib(i) <= max; i++){
			if(fib(i) % 2 == 0){
				sum += fib(i);
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		Problem2 p = new Problem2();
		System.out.println(p.sum(4000000));
	}
}
