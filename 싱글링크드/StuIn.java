package 싱글링크드;

//데이터 클래스

class StuIn {

	private String name;
	private int kor;
	private int eng;
	private int math;

	    
	public String toString() {
		return "이름:" + name + "\t" + "국어:" + kor + "\t"
				+ "영어:" + eng + "\t" + "수학:" + math + "\t" + "합계:" + getTotal() + "\t"
				+ "평균:" + getAvg();
	}
	
	// 리스트 초기화
	public StuIn(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return (double) getTotal() / 3;

	}

	public int getTotal() {

		return getKor() + getEng() + getMath();
	}

}
