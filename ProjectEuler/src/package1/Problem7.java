package package1;

/**********************************************************************
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * @author john
 * @version 12/27/13
 *********************************************************************/
public class Problem7 {
	long begin;
	long end;
	
	private boolean isPrime(int x){
		if(x == 2)
			return true;
		if(x % 2 == 0 || x == 1){
			return false;
		}
		long limit = (long) Math.sqrt(x);
		for(int i = 3; i <= limit; i += 2){
			if(x % i == 0) 
				return false;
		}
		return true;
	}

	public int whichPrime(int num){
		begin = System.currentTimeMillis();
		int i = 1;
		int numOfPrimes = 0;
		int prime = 0;
		boolean stop = false;
		while(!stop){
			if(isPrime(i)){
				numOfPrimes++;
			}
			if(numOfPrimes == num){
				stop = true;
				prime = i;
			}
			i++;
		}
		end = System.currentTimeMillis();
		return prime;
	}

	public static void main(String[] args){
		Problem7 p = new Problem7();
		System.out.println(p.whichPrime(6));
		System.out.println(p.end-p.begin + " ms\n");
		System.out.println(p.whichPrime(10001));
		System.out.println(p.end-p.begin + " ms");
	}
}
