/*
 * inner class
 * - outter class�� ����ν� ���� // �ϱ� ������ 
 * - outter class�� �ʵ带 ���������� ����� ������ Ŭ���� //������ 
 * - event ó�� �� ���� ���.
 * - outter class�� ��ü�� �����ϰ� inner class�� ��ü�� ������ ���.
 * 
 * 
 * 1. member inner class *
 * 2. static inner class
 * 3. local inner class
 * 4. anonymous inner class (�͸� ���� Ŭ����) *  ���� ���� ����.
 */

//final
//
//1. field ->���
//
//2. method -> �������̵� ����
//
//3.class -> ��ӱ���   ex)String Ŭ����


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
