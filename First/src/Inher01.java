/*
 * 상속
 *  - 100프로 상속구조
 *  - 클래스명 extends 상속받는 클래스명.
 *  - 상속 해주는 클래스 super class
 *  - 상속 받는 클래스 sub class
 *  - 코드의 확장 , 재사용성 , 유지보수의 효율을 높인다.
 *  - is ~ A관계  ~는 ~이다.
 *  - 객체 간 다중상속을 허용하지 않는다. 단일상속만 가능
 *  - 명확하다. 
 *  
 *  오버라이딩. -> 다형성
 *  
 *   -부모의 메소드중 하나를 자식클래스에서 재정의 
 *   - 부모의 내용을 변경, 추가해서 사용할 수 있게 해준다.
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
		// super();  => 부모의 생성자 호출  디폴트값으로 있음.  서브 클래스에 생성자 첫번째 라인에 항상 존재.
		super(10);
		System.out.println("sub class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inher01 in = new Inher01();
		
		//in.a=100;
		
		in.setA(100);
		
		System.out.println(in.getA());
		//System.out.println(in.a);   //필드값을 이렇게 직접 접근하는건 좋지 않음.... 필드가 private일 때는 접근못함

	}

}
