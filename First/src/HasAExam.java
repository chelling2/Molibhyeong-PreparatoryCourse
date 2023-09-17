import java.util.Scanner;

class Name {
	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
}

class Subject {

	private int kor;
	private int eng;
	private int mat;
	private int total = 0;
	private float avg;

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void setJ(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total += kor + eng + mat;
	}

	public float getAvg() {
		avg = getTotal() / 3;
		return avg;
	}

	public int getTotal() {
		return total;
	}

}

public class HasAExam {

	private Name n;
	private Subject s;

	public HasAExam() {
		n = new Name();
		s = new Subject();
	}

	private void setA(String i) {

		n.setA(i);

	}

	private String getA() {

		return n.getA();
	}

	public int getKor() {
		return s.getKor();
	}

	public int getEng() {
		return s.getKor();
	}

	public int getMat() {
		return s.getKor();
	}

	public float getAvg() {
		return s.getAvg();
	}

	public int getTotal() {
		return s.getTotal();
	}

	public void setS(int k, int e, int m) {
		s.setJ(k, e, m);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HasAExam ha = new HasAExam();
		System.out.println("이름 입력하세요");
		ha.setA(sc.next());
		System.out.println("국어 입력하세요");
		int kor = (sc.nextInt());
		System.out.println("영어 입력하세요");
		int eng = (sc.nextInt());
		System.out.println("수학 입력하세요");
		int mat = (sc.nextInt());

		ha.setS(kor, eng, mat);

		System.out.println("이름 :" + ha.getA() + " " + "국어 : " + ha.getKor() + " " + "영어 : " + ha.getEng() + " "
				+ "수학 : " + ha.getMat() + "=" + " " + ha.getTotal() + "평균 : " + ha.getAvg());
	}

}
