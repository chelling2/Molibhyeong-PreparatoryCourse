/*
 * �������ε�
 * - �θ��� ���۷����� �ڽ��� ��ü�� �����ϴ� ���.
 * - �θ��� ����� �ν��ϹǷ� �θ� ������ �ִ� ����� ������ �� �ִ�. 
 * - �ڽĸ� ������ �ִ� ����� �ν� �� �� ����.
 */


// �߻�Ŭ���� 
//�߻�Ŭ������ �߻�޼ҵ� 1�� �̻��� ����. class �տ� abstract �ٿ��� 
abstract class Area {
	public abstract void disp();
	public abstract void draw();
	//public abstract void aaa();
	

}

class Tri extends Area {

	@Override  // ������̼� �������̵� �޼ҵ����� �ð��� �Ǻ��ϱ� ���� ��� 
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

		// ���� ���ε� : �� ��ü�� ���� �� �� �ִ� ���۷��� ��ü�� �����ϴ� ���.
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
