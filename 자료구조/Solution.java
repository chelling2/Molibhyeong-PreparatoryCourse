import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k; 
        
        k = scanner.nextInt();

        for (int t = 1; t <= k; t++) {
            int N, A, B;

            N = scanner.nextInt();
            A = scanner.nextInt();
            B = scanner.nextInt();

            int temp;
            if (A > B) {
                temp = A;
                A = B;
                B = temp;
            }

            int box = 0;
            int i = 1;
            int a = 0;

            while (a < N) {
                a = A * i;
                if (N == a) {
                    box = i;
                    break;
                }
                i++;
            }

            if (box == 0) {
                a = A * (i - 2);
                i -= 2;

                int b;
                int c;
                for (c = 1; c < N; c++) {
                    b = B * c;

                    if (N == a + b) {
                        box = i + c;
                        break;
                    }

                    if (a + b > N) {
                        break;
                    }
                }

                box = i;
            }

            System.out.println("Case  #" + t + " "+ box);
        }

        scanner.close();
    }
} 
