import java.util.*;
// 홀수로 입력해야함 
public class Star {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("홀수 입력:");
		int a = scanner.nextInt();

		int e = 1;
		while (e <= a) {
			if (e <= (a + 1) / 2) {
				for (int i = 1; i <= (a + 1) / 2 - e; i++) {
					System.out.print(" ");
				}
				for (int i = 1; i <= e * 2 - 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int i = 1; i <= e - (a + 1) / 2; i++) {
					System.out.print(" ");
				}
				for (int i = 1; i <= a * 2 - e * 2 + 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			e++;
		}

	}

}
