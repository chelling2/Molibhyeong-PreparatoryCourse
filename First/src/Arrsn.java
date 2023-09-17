
import java.util.Scanner;

// 클래스를 이용한 성적처리 n명
// 객체 배열을 이용한 방법.

public class Arrsn {

	// 필드
	private String name;
	private int[] score;
	private float avg;

	// 생성자
	public Arrsn() {
		score = new int[4];
	}

	// 메소드
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

		System.out.println("몇명을 입력 받을건가요?");
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
