public class Fib {

	private static final int SIZE = 100;
	private static final int[] memo = new int[SIZE];

	static {
		for (int i = 0; i < SIZE; i++) {
			memo[i] = -1;
		}
	}

	public static int rec(int n) {
		if (n < 0) {
			return -1;
		}
		else if (memo[n] == -1) {
			if (n == 0 | n == 1) {
				memo[n] = n;
			}
			else {
				memo[n] = rec(n-1) + rec(n-2);
			}
		}

		return memo[n];
	}

	public static int iter(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		else if (n > 1) {
			int n1 = 1;
			int n2 = 1;

			for (int i = 0; i < n-2; i++) {
				int n3 = n2 + n1;
				n1 = n2;
				n2 = n3;
			}

			return n2;
		}
		else {
			return ((n % 2 == 0) ? -1 : 1) * iter(n*-1);
		}
	}

	public static int binet(int n) {
		return 0;
	}

	public static void main(String[] args) {

		System.out.println("REC");
		int[] solRec = new int[SIZE];

		for (int n = 0; n < SIZE; n++) {
			solRec[n] = rec(n);
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("%d ", solRec[i]);
		}

		System.out.println();

		System.out.println("ITER");
		int[] solIter = new int[SIZE];

		for (int n = 0; n < SIZE; n++) {
			solIter[n] = iter(n);
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("%d ", solIter[i]);
		}

	}
}