/*
 * 오버로딩
 * 동일한 함수명으로 여러개의 함수를 제공해서 사용하게 해주는 기술
 * 매개변수의 타입 또는 개수로 구별이 가능함.
 * 목적이 다른 함수끼리는 암묵적으로 오버로딩 금지 ex)입력과 출력등등 목적이 다른거
 * 리턴 타입이 다를 경우 -> 오버로딩이 아님 
 */


//마우스 오른쪽 source에서 ex)게터,세터 등등 미리지정 가능

public class OverExam {

	
	private int a;
	private int b;
	
	
	public OverExam(int aa, int bb) {
		System.out.println("Default2");
		a=aa;
		b=bb;
	}
	
	public OverExam() {
		System.out.println("Default1");
		
	}
	
	
	public int getA() {
		return a;
	}

	public int getA(int aa) {
		return a+aa;
	}
	
	public int getB() {
		return b;
	}


	public static void main(String[] args) {
		

		OverExam oe1 = new OverExam();
		
		System.out.println((oe1.getA()));
		System.out.println((oe1.getB()));
		
		
		
		

		OverExam oe2 = new OverExam(10,20);
		
		System.out.println((oe2.getA()));
		System.out.println((oe2.getB()));
		
	}

}
