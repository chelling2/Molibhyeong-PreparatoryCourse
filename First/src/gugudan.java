public class gugudan {

	public static void main(String[] args) {

//		int a,b;
//
//		for(a=1; a<=9; a++) {
//
//			for(b=2; b<=9; b++) {
//
//				System.out.printf("%2d * %2d = %2d",b,a,a*b);
//
//			}
//
//			System.out.printf("\n");
//		}
		
	
		        int a = 1;
		        int b = 2;

		        while (a <= 9) {
		            while (b <= 9) {
		                System.out.printf("%2d * %2d = %2d", b, a, a * b);
		                b++;
		            }
		            System.out.println();
		            a++;
		            b = 2;
		        }
		    }
		}
