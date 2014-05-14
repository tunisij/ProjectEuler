package package1;

/**********************************************************************
 * A palindromic number reads the same both ways. The largest 
 * palindrome made from the product of two 2-digit numbers 
 * is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product
 * of two 3-digit numbers.
 * 
 * @author john
 * @version 12/26/13
 *********************************************************************/
public class Problem4 {
	long begin;
	long end;

	private boolean isPalindrome(int num){
		String s = "" + num;
		
		for(int i = 0, j = s.length()-1; i < s.length()/2; i++, j--){
			if(s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
	
	public int largestPal(int digits){
		begin = System.currentTimeMillis();
		//creates min and max for x number of digits
		int max = 9;
		int min = 1;
		for(int d = 1; d < digits; d++){
			max *= 10;
			max += 9;
			min *= 10;	
		}
				
		int largest = 0;
		int curr = 0;
		for(int i = max; i >= min; i--)
			for(int j = max; j >= min; j--){
				curr = i * j;
				if(isPalindrome(curr))
					if(curr > largest)
						largest = curr;
			}
		end = System.currentTimeMillis();
		return largest;
	}
	
	public static void main(String[] args){
		Problem4 p = new Problem4();
		System.out.println(p.largestPal(4));
		System.out.println(p.end-p.begin + " ms");
	}
}
