package package1;

/**********************************************************************
 * If we list all the natural numbers below 10 that are multiples 
 * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author john
 * @version 12/23/13
 *********************************************************************/
public class Problem1 {
	
	private int findSum(int mult1, int mult2, int top){
		int sum = 0;
		
		for(int i=0; i < top; i++) {
            if((i % mult1 == 0) || (i % mult2 == 0)){
                sum += i;
            }
        }
		return sum;
	}
	
	public static void main(String[] args){
		Problem1 p = new Problem1();
		System.out.println(p.findSum(3, 5, 10));
		System.out.println(p.findSum(3, 5, 1000));
		System.out.println(p.findSum(3, 5, 10000));
		System.out.println(p.findSum(3, 5, 500));
	}
}
