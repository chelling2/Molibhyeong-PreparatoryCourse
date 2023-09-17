import java.util.Scanner;

public class Second {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 숫자 입력하세요");
		int num = sc.nextInt();
		

		System.out.println("기호 입력하세요");
		char op = sc.next().charAt(0);

		System.out.println("두 번째 숫자 입력하세요");
		int num2 = sc.nextInt();

		int result = 0;
		

		switch(op) {
		
		case '+' : result = num + num2; break;
		case '-' : result = num + num2; break;
		case '*' : result = num + num2; break;
		case '/' : result = num + num2; break;
		
		default : System.out.println("연산자 잘못 입력하였습니다.");
		
		}
		
		System.out.println(num + " " + op +" "+ num2 + " = " + result);


	}
}







