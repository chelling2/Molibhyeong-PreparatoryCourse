import java.util.Scanner;

public class Baseball {

	
	private static int[] cn;
	private static int[] un;
	private static String une;
	private int bCount; // 베이스볼 횟수
	private int sCount; // 스트라이크 횟수 
	private int count;  // 총 횟수

	// 생성자를 이용하여 컴퓨터변수 초기화 
	public Baseball() {
		
		cn= new int[3];
		un= new int[3];
		
		for(int i=0; i<cn.length; i++) {	
			cn[i]= (int)(Math.random()*10);
		}
		
	}
	
	//중복 제거 
	public int[] ju(int[] m) {
		for(int i=0; i<m.length-1; i++) {
			if(m[i]==m[i+1]) {
				m[i]=(m[i]+(int)(Math.random()*10))%10;
			}
		}
		return m;
	}
	
	
	//값을 비교하여 위치와 숫자가 같으면 스트라이크카운트 증가 , 숫자만 같을 시 볼카운트 증가 
	public void play() {
		
		bCount = 0;
		sCount = 0;
		
		for(int i=0; i<cn.length; i++) {
			for(int j=0; j<cn.length; j++) {
				
				if(cn[i]==un[j]) {
					if(i==j) {
						sCount++;
					}
					else {
						bCount++;
					}
				}
			}
		}
		
		if(sCount==3) {
			System.out.println("쓰리 쓰투라이크~   " + count + "회로 성공하였습니다!");
			System.out.println("프로그램을 종료합니다!");
			
		}
		
		else {
			System.out.println(sCount + "스트라이크"+ "  " + bCount + "볼입니다" );
		}
		
	}
	
	

	public static void good() {
	
		Baseball bb= new Baseball();
		
//		for(int p=0;p<cn.length; p++) {
//			System.out.print(cn[p]);  // 랜덤 숫자 출력  
//		}
	
		Scanner sc = new Scanner(System.in);
		
		while(bb.sCount != 3) {
			System.out.print("숫자 입력하세요");
			une= sc.next();
			
			String[] une2= une.split("");
			
			for(int i=0; i<cn.length; i++) {
				un[i]=Integer.parseInt(une2[i]);
			}
			bb.count++;
			
			bb.ju(un);
			bb.play();
		}
	}

}
