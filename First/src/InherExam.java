//클래스를 상속
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
	
	@Override // 어노테이션 메소드 재정의 할 때 써줘서 오버라이딩했다는 것을 알려주는게 좋음 
	public void disp() {    //오버라이딩 되었기 때문에 부모의 메소드가 은닉화 됨.
							                       // 부모꺼 변경할 때만 사용함. 
		// disp(); //앞에 this가 생략되었기 때문에 오류남.
		// super.disp();           
		System.out.println("hoho");
	}
}

public class InherExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C cc= new C(1,2,3);   //정적바인딩
		// A cc= new C(1,2,3);   //동적바인딩
		
		
		System.out.println(cc.getA());   // 1
		System.out.println(cc.getB());   // 2 
		System.out.println(cc.getC());  // 3
		
		cc.disp();

	}

}
