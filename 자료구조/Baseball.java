import java.util.Scanner;

public class Baseball {

	
	private static int[] cn;
	private static int[] un;
	private static String une;
	private int bCount; // ���̽��� Ƚ��
	private int sCount; // ��Ʈ����ũ Ƚ�� 
	private int count;  // �� Ƚ��

	// �����ڸ� �̿��Ͽ� ��ǻ�ͺ��� �ʱ�ȭ 
	public Baseball() {
		
		cn= new int[3];
		un= new int[3];
		
		for(int i=0; i<cn.length; i++) {	
			cn[i]= (int)(Math.random()*10);
		}
		
	}
	
	//�ߺ� ���� 
	public int[] ju(int[] m) {
		for(int i=0; i<m.length-1; i++) {
			if(m[i]==m[i+1]) {
				m[i]=(m[i]+(int)(Math.random()*10))%10;
			}
		}
		return m;
	}
	
	
	//���� ���Ͽ� ��ġ�� ���ڰ� ������ ��Ʈ����ũī��Ʈ ���� , ���ڸ� ���� �� ��ī��Ʈ ���� 
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
			System.out.println("���� ��������ũ~   " + count + "ȸ�� �����Ͽ����ϴ�!");
			System.out.println("���α׷��� �����մϴ�!");
			
		}
		
		else {
			System.out.println(sCount + "��Ʈ����ũ"+ "  " + bCount + "���Դϴ�" );
		}
		
	}
	
	

	public static void good() {
	
		Baseball bb= new Baseball();
		
//		for(int p=0;p<cn.length; p++) {
//			System.out.print(cn[p]);  // ���� ���� ���  
//		}
	
		Scanner sc = new Scanner(System.in);
		
		while(bb.sCount != 3) {
			System.out.print("���� �Է��ϼ���");
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
