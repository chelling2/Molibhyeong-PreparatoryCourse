import java.util.Scanner;

//Ŭ������ �̿��� n�� ����ó�� 

public class Arrn {
//�ʵ�

	private int[][] score;
	private float avg;
	private String[] name;
	private int count;
	private int Kor;
	private int Eng;
	private int Math;


//������
	public Arrn(int n) {
		score = new int[n][4];
		name= new String[n];
	}

//�޼ҵ�
	public void setName(int n,String na) {
		name[n] = na;
	}
	public void setCount(int c) {
		count=c;
	}

	public void setKor(int n,int k) {
		score[n][0] = k;
	}

	public void setEng(int n,int e) {
		score[n][1] = e;
	}

	public void setMath(int n,int m) {
		score[n][2] = m;
	}

	public String getName(int n) {
		return name[n];
	}
	public int getCount() {
		return count;
	}

	public int getKor(int n) {
		return score[n][0];
	}

	public int getEng(int n) {
		return score[n][1];
	}

	public int getMath(int n) {
		return score[n][2];
	}

	
	public int getTotal(int n) {
		return score[n][3]=getKor(n)+getEng(n)+getMath(n);

	}

	public float getAvg(int n) {
		return getTotal(n)/3.f;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �Է��Ͻǰǰ���?");
		
		int t=sc.nextInt();
		Arrn ce = new Arrn(t);
		
		
		ce.setCount(t);
		
		for(int i=0;i<t;i++) {
		System.out.println("�̸� ���� ���� ���� �Է����ּ��� ");
		String name = sc.next();
		int kor=sc.nextInt();
		int Eng=sc.nextInt();
		int Math=sc.nextInt();
		
		ce.setName(i,name);
		ce.setKor(i,kor);
		ce.setEng(i,Eng);
		ce.setMath(i,Math);
		}
		
		for(int i=0;i<t;i++) {
		System.out.print(ce.getName(i));
		System.out.print(ce.getKor(i));
		System.out.print(ce.getEng(i));
		System.out.print(ce.getMath(i));
		System.out.print(ce.getTotal(i));
		System.out.println(ce.getAvg(i));
		}
	}

}