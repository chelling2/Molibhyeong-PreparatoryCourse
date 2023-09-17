import java.util.Arrays;

public class P1 {

	public static void good() {

		int a, b, c, d;
		
		int[] k;

		for (int i = 1000; i < 10000; i++) {

			a = i / 1000;
			b = i / 100 % 10;
			c = i / 10 % 10;
			d = i % 10;

			k = new int[] { a, b, c, d };

			int temp;

			Arrays.sort(k);

			if (k[0] == 0) {
				for (int y = 1; y < k.length; y++) {
					if (k[y] > 0) {
						temp = k[0];
						k[0] = k[y];
						k[y] = temp;
						break;
					}
				}
			}
			
			System.out.printf("%d %d%d%d%d", i, k[0], k[1], k[2], k[3]);
			System.out.println();
		}

	}

}
