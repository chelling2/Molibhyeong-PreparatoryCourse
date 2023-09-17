
import java.util.Scanner;

// Ŭ������ �̿��� ����ó�� n��
// ��ü �迭�� �̿��� ���.

public class Arrsn {

	// �ʵ�
	private String name;
	private int[] score;
	private float avg;

	// ������
	public Arrsn() {
		score = new int[4];
	}

	// �޼ҵ�
	public void setName(String n) {
		name = n;
	}

	public void setKor(int k) {
		score[0] = k;
	}

	public void setEng(int e) {
		score[1] = e;
	}

	public void setMat(int m) {
		score[2] = m;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return score[0];
	}

	public int getEng() {
		return score[1];
	}

	public int getMat() {
		return score[2];
	}

	public int getTotal() {
		return score[3] = getKor() + getEng() + getMat();
	}

	public float getAvg() {
		return getTotal() / 3.f;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����� �Է� �����ǰ���?");
		int k = sc.nextInt();

		Arrsn[] ce = new Arrsn[k];

		for (int s = 0; s < k; s++) {

			ce[s] = new Arrsn();

			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();

			ce[s].setName(name);
			ce[s].setKor(kor);
			ce[s].setEng(eng);
			ce[s].setMat(mat);
		}

		for (int q = 0; q < k; q++) {

			System.out.println(ce[q].getName());
			System.out.println(ce[q].getKor());
			System.out.println(ce[q].getEng());
			System.out.println(ce[q].getMat());
			System.out.println(ce[q].getTotal());
			System.out.println(ce[q].getAvg());
		}

	}

}
