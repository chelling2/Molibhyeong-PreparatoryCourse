/*
 * ���
 *  - 100���� ��ӱ���
 *  - Ŭ������ extends ��ӹ޴� Ŭ������.
 *  - ��� ���ִ� Ŭ���� super class
 *  - ��� �޴� Ŭ���� sub class
 *  - �ڵ��� Ȯ�� , ���뼺 , ���������� ȿ���� ���δ�.
 *  - is ~ A����  ~�� ~�̴�.
 *  - ��ü �� ���߻���� ������� �ʴ´�. ���ϻ�Ӹ� ����
 *  - ��Ȯ�ϴ�. 
 *  
 *  �������̵�. -> ������
 *  
 *   -�θ��� �޼ҵ��� �ϳ��� �ڽ�Ŭ�������� ������ 
 *   - �θ��� ������ ����, �߰��ؼ� ����� �� �ְ� ���ش�.
 *  
 */

class Inher{
	private int a;
	private int b;
	public Inher() {
		System.out.println("super class");
	}
	
	public Inher(int i) {
		System.out.println("super2 class");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
}



public class Inher01 extends Inher{

	public Inher01() {
		// super();  => �θ��� ������ ȣ��  ����Ʈ������ ����.  ���� Ŭ������ ������ ù��° ���ο� �׻� ����.
		super(10);
		System.out.println("sub class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inher01 in = new Inher01();
		
		//in.a=100;
		
		in.setA(100);
		
		System.out.println(in.getA());
		//System.out.println(in.a);   //�ʵ尪�� �̷��� ���� �����ϴ°� ���� ����.... �ʵ尡 private�� ���� ���ٸ���

	}

}
