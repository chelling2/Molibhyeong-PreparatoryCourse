import java.util.Scanner;


// Ŭ������ �̿��� ����ó�� 1�� 

public class Arrp2 {

	//�ʵ�
	private String name;
	private int []score;
	private float avg;
	
	//������
	public Arrp2() {
		score=new int[4];
	}
	
	//�޼ҵ�
	public void setName(String n) {
		name=n;
	}
	
	public void setKor(int k) {
		score[0]=k;
	}
	
	public void setEng(int e) {
		score[1]=e;
	}
	
	public void setMat(int m) {
		score[2]= m;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return score[0];
	}
	
	public int getEng()
	{
		return score[1];
	}
	
	public int getMat() {
		return score[2];
	}
	
	
	public int getTotal() {
		return score[3]= getKor()+getEng()+getMat();
	}
	
	public float getAvg() {
		return getTotal()/3.f;
	}
	
	
	
	public static void main(String[] args) {
	
		
		Arrsn ce = new Arrsn();
		Scanner sc= new Scanner(System.in);
		
		String name = sc.next();		
		int kor = sc.nextInt();	
		int eng = sc.nextInt();		
		int mat = sc.nextInt();	
		
		ce.setName(name);
		ce.setKor(kor);
		ce.setEng(eng);
		ce.setMat(mat);
		
		System.out.println(ce.getName());
		System.out.println(ce.getKor());
		System.out.println(ce.getEng());
		System.out.println(ce.getMat());
		System.out.println(ce.getTotal());
		System.out.println(ce.getAvg());
		
		
	}

}
