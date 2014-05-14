package package1;

/**********************************************************************
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * Largest int 2147483647
 * 
 * @author john
 * @version 12/25/13
 *********************************************************************/
public class Problem3 {
	long begin;
	long end;
	
	private boolean isPrime(int x){
		if(x == 2)
			return true;
		if(x % 2 == 0 || x == 1){
			return false;
		}
		long limit = (long) Math.sqrt(x);
		for(int i = 3; i <= limit; i+=2){
			if(x % i == 0) 
				return false;
		}
		return true;
	}
	
	public int findLargestPrime(long n){
		begin = System.currentTimeMillis();
		int max = 0;
		while(n != 1){
			int i = 2;
			while(i <= n){
				if(isPrime(i) && n % i == 0){
					if(i > max)
						max = i;
					n /= i;
					break;
				}
				++i;
			}
		}
		end = System.currentTimeMillis();
		return max;
	}
	
	public static void main(String[] args){
		Problem3 p = new Problem3();
		System.out.println(p.findLargestPrime(600851475143L));
		System.out.println(p.end-p.begin + " ms");
	}
}
