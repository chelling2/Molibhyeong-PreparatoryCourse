import java.util.Scanner;

public class Second {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù ���� �Է��ϼ���");
		int num = sc.nextInt();
		

		System.out.println("��ȣ �Է��ϼ���");
		char op = sc.next().charAt(0);

		System.out.println("�� ��° ���� �Է��ϼ���");
		int num2 = sc.nextInt();

		int result = 0;
		

		switch(op) {
		
		case '+' : result = num + num2; break;
		case '-' : result = num + num2; break;
		case '*' : result = num + num2; break;
		case '/' : result = num + num2; break;
		
		default : System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
		
		}
		
		System.out.println(num + " " + op +" "+ num2 + " = " + result);


	}
}







