//Ŭ������ ���
class A{
	private int a;
	public A(int i){
		a=i;
	}
	public int getA() {
		return a;
	}
	
	public void disp() {
		System.out.println("haha");
	}
}

class B extends A{ 
	private int b;
	public B(int i,int k){
		super(i);
		b=k;
	}
	public int getB() {
		return b;
	}

}
class C extends B{
	private int c;
	
	public C(int a, int b, int c){
		super(a,b);
		this.c=c;
	}
	public int getC() {
		return c;
	}
	
	@Override // ������̼� �޼ҵ� ������ �� �� ���༭ �������̵��ߴٴ� ���� �˷��ִ°� ���� 
	public void disp() {    //�������̵� �Ǿ��� ������ �θ��� �޼ҵ尡 ����ȭ ��.
							                       // �θ� ������ ���� �����. 
		// disp(); //�տ� this�� �����Ǿ��� ������ ������.
		// super.disp();           
		System.out.println("hoho");
	}
}

public class InherExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C cc= new C(1,2,3);   //�������ε�
		// A cc= new C(1,2,3);   //�������ε�
		
		
		System.out.println(cc.getA());   // 1
		System.out.println(cc.getB());   // 2 
		System.out.println(cc.getC());  // 3
		
		cc.disp();

	}

}
