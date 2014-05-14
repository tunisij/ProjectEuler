package package1;

/**********************************************************************
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author john
 * @version 12/27/13
 *********************************************************************/
public class Problem10 {
	long begin;
	long end;
	
	//old way, slower
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
	
	
	public long sumOfPrimes(int range){
		begin = System.currentTimeMillis();
		long sum = 0;
		for(int i = 2; i < range; i++){
			if(isPrime(i))
				sum += i;
		}
		end = System.currentTimeMillis();
		return sum;
	}
		
	//new way, sieve of Eratosthenes
		public long sumOfPrimesFast(int range){
			begin = System.currentTimeMillis();
			boolean[] primes = new boolean[range];
			long sum = 0;
			//creates the list and marks all true
			for(int i = 0; i < range; i++)
				primes[i] = true;
			
			//
			for(int i = 2; i < Math.sqrt(range); i++){
				if(!primes[i])
					continue;
				else{
					int j = i + i;
					while(j < range){
						primes[j] = false;
						j += i;
					}	
				}
			}
			for(int i = 2; i < range; i++){
				sum += primes[i] ? i : 0;
			}
			end = System.currentTimeMillis();
			return sum;
		}
				
	public static void main(String[] args){
		Problem10 p = new Problem10();
		int n = 2000000;
		System.out.println(p.sumOfPrimesFast(n));
		System.out.println(p.end-p.begin + " ms with Sieve of Eratosthenes for " + n + "\n");
		System.out.println(p.sumOfPrimes(8000000));
		System.out.println(p.end-p.begin + " ms with Sieve of Eratosthenes for 8000000\n");
		System.out.println(p.sumOfPrimes(n));
		System.out.println(p.end-p.begin + " ms with slower method for " + n + "\n");
		System.out.println(p.sumOfPrimes(8000000));
		System.out.println(p.end-p.begin + " ms with slower method for 8000000\n");
	}
}
