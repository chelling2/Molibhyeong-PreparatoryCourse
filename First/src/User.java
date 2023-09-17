import java.util.Scanner;

public class User {

	// 갖다 쓰는 쪽에서 과목 결정 함.
	private Na name;
	private Sub kor;
	private Sub eng;
	private Sub mat;

	private int total;
	private float avg;

	public User() {
		name = new Na();
		kor = new Sub();
		eng = new Sub();
		mat = new Sub();

	}

	public void setName(String name) {
		this.name.setName(name);
	}

	public void setKor(int kor) {
		this.kor.setScore(kor);
	}

	public String getName() {
		return name.getName();
	}

	public int getKor() {
		return kor.getScore();
	}

	public int getEng() {
		return eng.getScore();
	}

	public void setEng(int eng) {
		this.eng.setScore(eng);
	}

	public int getMat() {
		return mat.getScore();
	}

	public void setMat(int mat) {
		this.mat.setScore(mat);
	}

	public int getTotal() {

		return total = getKor() + getEng() + getMat();
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg = getTotal() / 3;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User sm = new User();

		Scanner sc = new Scanner(System.in);

		System.out.print("이름과 과목을 입력해주세요: ");

		String na = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();

		sm.setName(na);
		sm.setKor(kor);
		sm.setEng(eng);
		sm.setMat(mat);

		System.out.println(sm.getName());
		System.out.println(sm.getKor());
		System.out.println(sm.getEng());
		System.out.println(sm.getMat());
		System.out.println(sm.getAvg());

	}

}
