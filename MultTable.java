public class MultTable {
	public static void ofSizeN(int n) {
		for (int i = 1; i < n+1; i++) {
			System.out.printf("   %d", i);
		}

		System.out.println();

		for (int i = 1; i < n+1; i++) {
			System.out.printf("%d   ", i);

			for (int j = 1; j < n+1; j++) {
				System.out.printf("%d   ", i*j);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		ofSizeN(12);
	}
}