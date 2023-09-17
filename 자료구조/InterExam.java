/*
 * 인터페이스
 * - 추상클래스 보다 더 추상화.
 * - 상수 , 추상메소드 
 * - 다중상속을 대체한다.
 * - 클래스가 인터페이스를 여러개 받을 수 있다.
 * - implements 사용함.
 * - interface끼리는 다중상속을 허용한다.
 */

interface A {

	int max = 100; // final static 생략되어 있음 && 상수는 변수이름 대문자로 하는게 관례
	// final static int max=100;

	public void disp(); // 인터페이스는 abstract 생략가능함. 자동으로 붙여줘서 근데.. 추상 클래스 같은 경우는 다 선언해줘야함.
	// public abstract void disp();

}

interface B {

	int max = 100;

	public void disp1();

}

interface C extends A,B{  // 인터페이스끼리 상속할 때는 extends 키워드 사용한다. 

	int max = 100;

	public void disp2();

}

public class InterExam implements C {   // 클래스에서 인터페이스 구현하려면 implements 키워드 사용한다.

	@Override
	public void disp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		C c = new InterExam();
		c.disp();
		c.disp1();
		c.disp2();

	}

}
