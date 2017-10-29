package combination;

public class Combination_lib {
	
	public int getFactorial(int n) {
		int k , result = 1 ;
		for (k = 1 ; k <= n ; k++) {
			result = result * k ;
		}
		n = result ;
		return n;
	}
	
}
