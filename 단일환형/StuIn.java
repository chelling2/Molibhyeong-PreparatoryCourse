package 단일환형;

//������ Ŭ����

class StuIn {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int count; // set �ε����� ���� 

	    
	public String toString() {
		return "�̸�:" + name + "\t" + "����:" + kor + "\t"
				+ "����:" + eng + "\t" + "����:" + math + "\t" + "�հ�:" + getTotal() + "\t"
				+ "���:" + getAvg();
	}
	
	// ����Ʈ �ʱ�ȭ
	public StuIn(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// �� �ʱ�ȭ
	public StuIn(int count, String name, int kor, int eng, int math) {
		this.count = count;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	// set �ε����� ��ȯ
	public int getCount() {
		return count;
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
