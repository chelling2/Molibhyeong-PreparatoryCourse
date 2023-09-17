/*
 * this , this()
 *  - this : 내 자신의 객체를 접근하는 레퍼런스변수
 *         : 항상 인스턴스메소드의 첫번째 매개변수로 항상 존재 
 *         : 명시적으로 선언 할 수 없다.   사용만 가능하다.
 *         : 1. 지역변수와 필드명이 동일 할 경우 this를 사용해서 필드를 구별해줘야한다.
 *         		우선순위가 지역변수가 빠르기 때문에
 *         
 *         	2. 메소드에서 자기 자신의 객체를 리턴해야할 경우 
 *         
 *         this를 사용함으로 써 메모리 절약할 수 있음. 
 *         
 *  this()    디스 호출
 *  - 현재 클래스내에 있는 생성자에서 오버로딩된 또 다른 생성자를 호출하는 방법.        
 */

public class ThisExam {

	private int a;
	private int b;

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	// setA(this, int a)
	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public ThisExam() {
		a=0;
		b=0;
		// this(0,0);
	}

	public ThisExam(int b) {
		this();
		a=b;
		// this(i,0);
	}
	
	public ThisExam(int a, int b) {
		this(a);
		this.b=b;
	}
	

//	public ThisExam getObject() {
//		return this; // 객체 자기자신을 반환
//	}

	public static void main(String[] args) {
		
		
//		ThisExam te1 = new ThisExam();
//
//		te1.setA(100);
//		System.out.println(te1.getA());
//
//		ThisExam te2 = new ThisExam();
//
//		te2.setA(200);
//		System.out.println(te2.getA());

		ThisExam te1 = new ThisExam();
		ThisExam te2 = new ThisExam(10);
		ThisExam te3 = new ThisExam(20, 30);

		System.out.println(te1.getA() + " " + te1.getB()); // 0,0
		System.out.println(te2.getA() + " " + te2.getB()); // 10 ,0
		System.out.println(te3.getA() + " " + te3.getB()); // 20,30

	}

}
