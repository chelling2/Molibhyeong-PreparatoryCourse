/*
 * �������̽�
 * - �߻�Ŭ���� ���� �� �߻�ȭ.
 * - ��� , �߻�޼ҵ� 
 * - ���߻���� ��ü�Ѵ�.
 * - Ŭ������ �������̽��� ������ ���� �� �ִ�.
 * - implements �����.
 * - interface������ ���߻���� ����Ѵ�.
 */

interface A {

	int max = 100; // final static �����Ǿ� ���� && ����� �����̸� �빮�ڷ� �ϴ°� ����
	// final static int max=100;

	public void disp(); // �������̽��� abstract ����������. �ڵ����� �ٿ��༭ �ٵ�.. �߻� Ŭ���� ���� ���� �� �����������.
	// public abstract void disp();

}

interface B {

	int max = 100;

	public void disp1();

}

interface C extends A,B{  // �������̽����� ����� ���� extends Ű���� ����Ѵ�. 

	int max = 100;

	public void disp2();

}

public class InterExam implements C {   // Ŭ�������� �������̽� �����Ϸ��� implements Ű���� ����Ѵ�.

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
