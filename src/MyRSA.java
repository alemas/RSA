
public class MyRSA {

	/**
	 * Reads two parameters p and q and computes the greatest common divisor of p
	 * and q using the extended Euclid's algorithm. 
	 * return array [d, a, b] such that d = gcd(p, q), ap + bq = d
	 * 
	 *  Sample execution:
	 * 
	 * gcd(36163, 21199) = 1247 -7(36163) +
	 * 12(21199) = 1247
	 *
	 * gcd(36163, 1058) = 1 493(36163) +
	 * -16851(1058) = 1
	 * 
	 * 
	 **/
	private static int[] gcd(int p, int q) {
		if (q == 0)
			return new int[] { p, 1, 0 };

		int[] vals = gcd(q, p % q);
		int d = vals[0];
		int a = vals[2];
		int b = vals[1] - (p / q) * vals[2];
		return new int[] { d, a, b };
	}

}
