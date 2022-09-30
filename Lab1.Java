public class Lab1 {
	public static void main(String[] value) {
		int a[] = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
		double[] x = new double[14];
		int ik = -1;
		while (++ik < 14) x[ik] = random() * 27 - 12;

		double[][] matrix = new double[15][14];
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 14; j++) {
				int[] search = {6, 7, 9, 10, 13, 14};
				if (a[i] == 16) {
					matrix[i][j] = countFirst(x[j]);
				} else if (contains(search, a[i])) {
					matrix[i][j] = countSecond(x[j]);
				} else {
					matrix[i][j] = countThird(x[j]);
				}
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 14; j++) {
				System.out.printf("%8.3f ", matrix[i][j]);
			}
			System.out.println("");
		}
	}

	private static double random() {
		return Math.random();
	}

	private static double countFirst(double x) {
		return Math.cbrt(Math.pow(Math.E, Math.sin(x)));
	}

	private static double countSecond(double x) {
		return Math.tan(
		           Math.pow(
		               Math.pow((x + 1.) / 3. / 4., x),
		               0.5 / (Math.cbrt(x) + Math.PI)
		           )
		       );
	}

	private static double countThird(double x) {
		final double t = Math.pow(2. / 3. * (Math.pow(Math.E, x) + Math.PI), 2.) / 2.;
		final double a = 1. / 4. - Math.pow(t, Math.cos(Math.sin(x)));

		final double n = Math.pow(x, x * (x - 0.25));
		final double k = Math.pow(Math.tan(Math.pow(Math.E, n)), 2.);
		final double c = Math.atan(1. / Math.pow(Math.E, k));

		return Math.pow(Math.atan(Math.pow(Math.cos(x), 2.)), (a / c));
	}

	private static boolean contains(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) return true;
		}
		return false;
	}
}

