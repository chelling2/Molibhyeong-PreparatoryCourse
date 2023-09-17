import java.util.Scanner;

public class calpp {

	//필드
	private int num1;
	private int num2;
	private String op;
	
	//생성자
	public calpp() {
		System.out.println("사칙연산계산기");
	}
	
	public void setNum1(int num) {
		num1=num;
	}
	
	public void setNum2(int num) {
		num2=num;
	}
	
	public void setOp(String o) {
		op=o;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public String getOp()
	{
		return op;
	}
	
	public int plus() {
		return num1+num2;
	}
	
	public int minus() {
		return num1-num2;
	}
	
	public int gop() {
		return num1*num2;
	}
	
	public float dev() {
		return (float)num1/(float)num2;
	}
	
	
	public static void main(String[] args) {
		
		calpp calc = new calpp();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산 식 입력하세요 ");
		
		int n1= sc.nextInt();
		String op = sc.next();
		int n2 = sc.nextInt();
		
		calc.setNum1(n1);
		calc.setNum2(n2);
		calc.setOp(op);
		
		
		if(op.equals("+"))
		System.out.println(calc.getNum1() + " " + calc.getOp()+ " "+calc.getNum2()+ "=" + calc.plus());
		
		else if(op.equals("-"))
			System.out.println(calc.getNum1() + " " + calc.getOp()+ " "+calc.getNum2()+ "=" + calc.minus());
		
		else if(op.equals("*"))
			System.out.println(calc.getNum1() + " " + calc.getOp()+ " "+calc.getNum2()+ "=" + calc.gop());
		
		else if(op.equals("/"))
			System.out.println(calc.getNum1() + " " + calc.getOp()+ " "+calc.getNum2()+ "=" + calc.dev());
		
		else
			System.out.println("잘못 입력하였습니다. ");
		

	}

}
