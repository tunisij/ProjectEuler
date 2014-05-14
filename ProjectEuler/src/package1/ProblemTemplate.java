package package1;

/**********************************************************************
 * 
 * 
 * @author john
 * @version 12/27/13
 *********************************************************************/
public class Problem {
	long begin;
	long end;
	

		begin = System.currentTimeMillis();
		end = System.currentTimeMillis();

	public static void main(String[] args){
		Problem p = new Problem();
		System.out.println();
		System.out.println(p.end-p.begin + " ms\n");
		System.out.println();
		System.out.println(p.end-p.begin + " ms");
	}
}
