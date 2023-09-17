import java.util.Scanner;

public class to {

	public static void main(String[] args) {

//		1번 
//		int a,b;
//		for(a=0; a<3; a++) {
//			for(b=0; b<4; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		2번
//		int a,b;
//		for(a=0; a<3; a++) {
//			for(b=1; b<=a+1; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//
//		3번
//		int i,j,k;
//		for (i=1; i<=3; i++) {
//			for (j=1; j<=3-i; j++) 
//				System.out.print(" ");
//
//			for (k=1; k<=i; k++) 
//				System.out.print("*");
//			
//			System.out.println();
//		}
//		
//		
//		4번
//		int i,j,k,l;
//		for(i=1; i<=3; i++)
//		{
//			for(j=1; j<3-i+1; j++)
//				System.out.print(" ");
//		
//			for(k=1; k<=i; k++)
//				System.out.print("*");
//		
//			for (l=1; l<i; l++)
//				System.out.print("*");
//			
//			System.out.println();
//		}
//		
//		
//		5번
//		int i,j,k,l;
//		for(i=1; i<=3; i++)
//		{
//			for(j=1; j<3-i+1; j++)
//				System.out.print(" ");
//		
//			for(k=1; k<=i; k++)
//				System.out.print("*");
//		
//			for (l=1; l<i; l++)
//				System.out.print("*");
//			
//			System.out.println();
//		}
//		
//		for (i=2; i>= 1; i--) {
//			
//			for (j=1; j<= 3-i; j++) 
//				System.out.print(" ");
//		
//			for (k=1; k<= i*2-1; k++) 
//				System.out.print("*");
//			
//
//			System.out.println();
//		} 
//			 
//		
//		6번
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
