
/*
 * 추상클래스
 * - 추상클래스는 객체를 생성할 수 없다. -> 구체화가 되지 않았기 때문에
 * - 추상메소드 : 구체화가 되지 않은 메소드. abstract 키워드를 꼭 사용해서 만들어야함.
 * - 추상메소드를 하나이상 가지고 있는 클래스를 추상클래스라고 부름. 
 * - 주로 상속을 목적으로 사용,
 * - 상속받은 자식클래스는 추상메소드를 오버라이딩을 해야한다.
 *   하지 않을경우 자식클래스도 추상클래스화 되서 객체를 생성할 수 없다. 
 * 
 *  - 이벤트처리 시 가장 많이 사용.
 * 
 * 인터페이스 
 * - 추상화 , 상수 + 추상메소드
 *   	
 * 
 */




public abstract class AbsExam {

	public abstract void disp();  // {} 바디가 없으면 추상메소드 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
