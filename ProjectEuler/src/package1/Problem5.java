package package1;

/**********************************************************************
 * 2520 is the smallest number that can be divided 
 * by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 * 
 * Alternate faster solution - prime factorization
 *  2^4*3^2*5*7*11*13*17*19 = 232792560
 * 
 * @author john
 * @version 12/26/13
 *********************************************************************/
public class Problem5 {
	
	public long beginSlow;
	public long endSlow;
	public long beginFast;
	public long endFast;

	public int smallDivByAll(int range){
		beginSlow = System.currentTimeMillis();
		boolean found = false;
		int smallest = 0;
		for(int j = 1; !found; j++){
			int count = 0;
			for(int i = 1; i <= range; i++){
				if(j % i == 0)
					count++;
			}
			if(count == range)
				return j;
		}
		endSlow = System.currentTimeMillis();
		return smallest;
	}
	
	

	public int quicker(int range){
		beginFast = System.currentTimeMillis();
		int s = range;
		int count = 0;
		while(true){
			for(int i = range; i > 0; i--)
				if(s % i == 0)
					count++;
			if(count == range){
				count = 0;
				break;
			}
			count = 0;
			s += range;
		}		
		endFast = System.currentTimeMillis();
		return s;
	}


	public static void main(String[] args){
		Problem5 p = new Problem5();
		System.out.println(p.quicker(20));
		System.out.println(p.endFast-p.beginFast + " msn\n");
		System.out.println(p.smallDivByAll(20));
		System.out.println(p.endSlow-p.beginSlow + " ms");
	}
}
