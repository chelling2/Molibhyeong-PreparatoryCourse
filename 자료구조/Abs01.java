/*
 * 동적바인딩
 * - 부모의 레퍼런스로 자식의 객체를 접근하는 방식.
 * - 부모의 멤버를 인식하므로 부모가 가지고 있는 멤버만 접근할 수 있다. 
 * - 자식만 가지고 있는 멤버는 인식 할 수 없다.
 */


// 추상클래스 
//추상클래스는 추상메소드 1개 이상을 가짐. class 앞에 abstract 붙여줌 
abstract class Area {
	public abstract void disp();
	public abstract void draw();
	//public abstract void aaa();
	

}

class Tri extends Area {

	@Override  // 어노테이션 오버라이딩 메소드인지 시각적 판별하기 위해 사용 
	public void disp() {
		
		
	}
//	public void draw() {
//		System.out.println("Tri");
//	}

	@Override
	public void draw() {
		System.out.println("Tri");
		
	}
	
	
}

class Cir extends Area {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
//	public void draw() {
//		System.out.println("Cir");
//	}

	@Override
	public void draw() {
		System.out.println("Cir");
		
	}
	
	
}

class Rect extends Area {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
//	public void draw() {
//		System.out.println("Rect");
//	}

	@Override
	public void draw() {
		System.out.println("Rect");
		
	}
	
	public void aaa() {
		System.out.println("aaa");
	}
	
}

public class Abs01 {

	public static void main(String[] args) {

		// 정적 바인딩 : 내 객체를 접근 할 수 있는 레퍼런스 객체를 접근하는 방식.
		Tri tri = new Tri();
		Cir cir = new Cir();
		Rect rect = new Rect();
		
		
		Area area;
		
		area= tri;
		
		tri.draw();
		area.draw();
		
		area=cir;
		cir.draw();
		area.draw();
		
		area=rect;
		rect.draw();
		area.draw();
		
		rect.aaa();
		//area.aaa();

	}

}
