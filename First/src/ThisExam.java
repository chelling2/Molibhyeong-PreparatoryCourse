/*
 * this , this()
 *  - this : �� �ڽ��� ��ü�� �����ϴ� ���۷�������
 *         : �׻� �ν��Ͻ��޼ҵ��� ù��° �Ű������� �׻� ���� 
 *         : ��������� ���� �� �� ����.   ��븸 �����ϴ�.
 *         : 1. ���������� �ʵ���� ���� �� ��� this�� ����ؼ� �ʵ带 ����������Ѵ�.
 *         		�켱������ ���������� ������ ������
 *         
 *         	2. �޼ҵ忡�� �ڱ� �ڽ��� ��ü�� �����ؾ��� ��� 
 *         
 *         this�� ��������� �� �޸� ������ �� ����. 
 *         
 *  this()    �� ȣ��
 *  - ���� Ŭ�������� �ִ� �����ڿ��� �����ε��� �� �ٸ� �����ڸ� ȣ���ϴ� ���.        
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
//		return this; // ��ü �ڱ��ڽ��� ��ȯ
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
