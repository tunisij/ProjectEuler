package package1;

/**********************************************************************
 * A Pythagorean triplet is a set of three natural numbers, a < b < c,
 * for which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 2^5 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * @author john
 * @version 12/27/13
 *********************************************************************/
public class Problem9 {
	long begin;
	long end;
	int sum;
	
	public int tripletProduct(int sum){
		begin = System.currentTimeMillis();
		for(int c = 1; c < sum/2-1; c++)
			for(int b = 1; b < c; b++)
				for(int a = 1; a < b; a++)
					if(a*a + b*b == c*c)
						if(a + b + c == sum)
							this.sum = a * b * c;
		end = System.currentTimeMillis();
		return this.sum;
	}

	public static void main(String[] args){
		Problem9 p = new Problem9();
		System.out.println(p.tripletProduct(1000));
		System.out.println(p.end-p.begin + " ms");
	}
}
