/*
 * �����ε�
 * ������ �Լ������� �������� �Լ��� �����ؼ� ����ϰ� ���ִ� ���
 * �Ű������� Ÿ�� �Ǵ� ������ ������ ������.
 * ������ �ٸ� �Լ������� �Ϲ������� �����ε� ���� ex)�Է°� ��µ�� ������ �ٸ���
 * ���� Ÿ���� �ٸ� ��� -> �����ε��� �ƴ� 
 */


//���콺 ������ source���� ex)����,���� ��� �̸����� ����

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
