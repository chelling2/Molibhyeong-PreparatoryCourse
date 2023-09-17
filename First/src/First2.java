import java.util.Scanner;

public class First2 {

	// 클래스를 이용한 사칙연산계산기
	//개인
	private int num,num2;
	private char op;
	
	public void setNum(int a) {
		num=a;
	}
	
	public void setNum2(int a) {
		num2=a;
	}
	public void setOp(char a) {
		op=a;
	}
	
	public char getOp() {
		return op;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public int plus(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int gop(int a, int b) {
		return a*b;
	}
	
	public float dev(int a, int b) {
		return (float)a/(float)b;
	}
	
	
	
	public void abc() {

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 숫자 입력하세요");
		setNum(sc.nextInt());

		System.out.println("기호 입력하세요");
		setOp(sc.next().charAt(0));

		System.out.println("두 번째 숫자 입력하세요");
		setNum2(sc.nextInt());

	}

	
	
	public static void main(String[] args) {
		
		int c;
		First2 as= new First2();
		int result = 0;
		
		
		do {
		as.abc();
		
		switch (as.getOp()) {
		case '+':
			System.out.println(as.getNum() + " " + as.getOp()+ " " + as.getNum2() + " = " + as.plus(as.getNum(),as.getNum2()));
			break;
		case '-':
			System.out.println(as.getNum() + " " + as.getOp()+ " " + as.getNum2() + " = " + as.minus(as.getNum(),as.getNum2()));
			break;
		case '*':
			System.out.println(as.getNum() + " " + as.getOp()+ " " + as.getNum2() + " = " + as.gop(as.getNum(),as.getNum2()));
			break;
		case '/':
			System.out.println(as.getNum() + " " + as.getOp()+ " " + as.getNum2() + " = " + as.dev(as.getNum(),as.getNum2()));
			break;
		default:
			System.out.println("연산자를 잘못 입력하였습니다.");
		}
	
		System.out.println("계속 사용하실거면 y를 입력해주세요. ");
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		}while(c=='y' || c=='Y');
	}
	
	
	
	
	
}
