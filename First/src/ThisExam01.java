
public class ThisExam01 {

	
	private int a;
	private int b;
    private static int t;
    private static int k;
	
	static void disp() {
		ThisExam01 c= new ThisExam01();   // �� ����� �ʵ� static ������ϰ� ����ϴ� ��� 
 		System.out.println(c.a+" " +c.b);    
		

		System.out.println(t+ " " + k);   // �ʵ� static �����ϰ� ����ѰŰ� 
	}
	
	
	
	private ThisExam01() {
		
	}
	
	
	public static void main(String[] args) {
		
		// static�� this�� ����. 
		
//		ThisExam01 te1 = new ThisExam01();
//		te1.disp();
		
		
		ThisExam01.disp();
		

	}

}
