package Manage;

public class User {
	
	private String rank;// 직급
	public String name;// 사용자 이름
	public boolean full_time;// 정규직: true/비정규직: false
	public int id; // 사용자 아이디
	public String gender;// 사용자 성별
	public String p_n;// 사용자 전화번호
	public String address;// 사용자 집주소
	public int age;// 사용자 나이
	public String bank;// 사용자 은행
	public long bankAddress;// 사용자 계좌번호
	public int defaultTime;// (비정규직)기본근무시간
	public int timeAmount;// 호봉
	public int userCount;// 유저 수

	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getTimeAmount() {
		return timeAmount;
	}
	public void setTimeAmount(int timeAmount) {
		this.timeAmount = timeAmount;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFull_time() {
		return full_time;
	}
	public void setFull_time(boolean full_time) {
		this.full_time = full_time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getP_n() {
		return p_n;
	}
	public void setP_n(String p_n) {
		this.p_n = p_n;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public long getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(long bankAddress) {
		this.bankAddress = bankAddress;
	}
	public int getDefaultTime() {
		return defaultTime;
	}
	public void setDefaultTime(int defaultTime) {
		this.defaultTime = defaultTime;
	}
	
}

