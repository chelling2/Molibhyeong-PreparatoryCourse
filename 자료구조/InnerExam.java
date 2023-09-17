/*
 * inner class
 * - outter class의 멤버로써 존재 // 하기 때문에 
 * - outter class의 필드를 직접적으로 사용이 가능한 클래스 //장점임 
 * - event 처리 시 많이 사용.
 * - outter class의 객체를 생성하고 inner class의 객체를 생성후 사용.
 * 
 * 
 * 1. member inner class *
 * 2. static inner class
 * 3. local inner class
 * 4. anonymous inner class (익명 내부 클래스) *  제일 많이 쓰임.
 */

//final
//
//1. field ->상수
//
//2. method -> 오버라이딩 금지
//
//3.class -> 상속금지   ex)String 클래스


abstract class Test{
	abstract void tt();
}


public class InnerExam {

	private int a;
	protected int b;
	public int c;
	public static int d;

	
	public void output() {
	// class A {  // member inner class.
		
		//public void disp() {
		//	System.out.println(a);
		//	System.out.println(b);
		//.out.println(c);
		//	System.out.println(d);
		// }
		
		Test t = new Test() {
			
			void tt() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		};
		
		t.tt();
		
	}
	 
	// A aa= new A();
	// aa.disp();
	 
	//}
	
	public static void main(String[] args) {
		InnerExam in = new InnerExam();
		
		in.output();
		
		
		
		// InnerExam.A aa= in.new A();
		
		//aa.disp();
		
	}

}
