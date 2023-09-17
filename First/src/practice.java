
public class practice {

	// 접은 횟수
	// 사각형 개수 
	
	public static void main(String[] arg) {
		
		int a,b=1;
		
		for(a=0; b<500; a++) 
			b*=2;
		// b <<=1; 비트 왼쪽 쉬프트 연산자를 이용해서도 구현 할 수 있음. 
		System.out.println("접은 횟수 : " + a + "\n" + "사각형의 개수 : " + b + "\n");
		
	}
}
