
/*
 * 클래스의 구성요소
 * 1. field
 * - 객체 생성 후 지속적으로 사용하고자 하는 데이터.
 * - 접근지정자 주로 private으로 지정합니다.
 * ------------------------------------------------------------
 * 2. method
 * - 인스턴스메소드 instance method : 객체를 생성한 후 사용 할 수 있는 메소드.
 * 	- 매개변수의 첫번째 매개변수 this를 가지고 있다.
 * 	- 의미상 객체당 하나씩 가지고 있는 의미가 성립.
 * 
 * - 스태틱메소드 static method : 객체 생성 유무와 상관없이 사용할 수 있는 메소드.
 * 	- this를 가지고 있지 않다.
 * 	- 같은 타입의 모든 객체가 공유하는 의미.
 * 
 * 	- 주 목적 : 외부와 내부를 연결시켜주는 역할
 * 	- 접근 지정자를 주로 public으로 지정.
 * 	- 오버로딩이 가능.
 * ------------------------------------------------------------
 * 3. constructor
 * - 객체 생성 시 자동 호출 되어지는 함수
 * - 생성자 함수를 명시적으로 만들지 않을경우 디폴트생성자를 제공합니다.
 * 
 * - 기능 : 디폴트기능 -> 객체 등록.
 * 			개발자 -> 객체 생성 시 필드 초기화
 * 
 * - 주로 public으로 지정
 * - 오버로딩이 가능. 
 * 
 */



public class Classpr {

	// 생성자를 제공하지 않을 경우 내부적으로 제공하는 생성자 : 디폴트 생성자.
	// 명시적으로 생성자를 만들 경우 디폴트 생성자는 제공되지 않음. 
	// 생성자는 리턴타입이 존재하지 않고, 함수명도 클래스명과 동일해야함.
	
	//필드 
	private int a; 
	
	public Classpr() {
		System.out.println("디폴트 생성자");
	}
	
	public int getA() {  //getter
		return a;
	}
	
	public void setA(int aa) {   //setter
		a=aa;
	}
	
	public static void main(String[] args) {   // 외부에서 쓰게 끔 해야함. 

		Classpr ce = new Classpr(); // 생성자 호출 
		Classpr ce2 = new Classpr(); // 생성자 호출 
		
		ce.a = 100;
		ce2.a=200;
		
		ce.setA(100);
		ce.setA(200);
		
		System.out.println(ce.getA());
		System.out.println(ce2.getA());

	}

}
