
public class ThisExam01 {

	
	private int a;
	private int b;
    private static int t;
    private static int k;
	
	static void disp() {
		ThisExam01 c= new ThisExam01();   // 이 방법은 필드 static 선언안하고 출력하는 방법 
 		System.out.println(c.a+" " +c.b);    
		

		System.out.println(t+ " " + k);   // 필드 static 선언하고 출력한거고 
	}
	
	
	
	private ThisExam01() {
		
	}
	
	
	public static void main(String[] args) {
		
		// static은 this가 없음. 
		
//		ThisExam01 te1 = new ThisExam01();
//		te1.disp();
		
		
		ThisExam01.disp();
		

	}

}
