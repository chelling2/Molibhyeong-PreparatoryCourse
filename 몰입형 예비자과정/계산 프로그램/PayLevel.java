package Manage;

import java.util.Scanner;

class PayLevel {
	private double tempUserPay;
	private double[] timePay;
	private double[] payLevel;
	private User u;
	Scanner sc;

	public PayLevel() {
		u = new User();
		tempUserPay = 10000; // 비정규직 시급
		timePay = new double[] { 10000, 15000, 20000, 25000, 30000 }; // 정규직 시급
		payLevel = new double[] { 1800000, 2500000, 3000000, 3500000, 4000000, 4500000 }; // 비정규/ 정규 급여
		sc = new Scanner(System.in);
	}

	public double choiceTimePay(String rank) { // 시급 리턴
		
		switch (rank) {
			case "사원":
				return timePay[0];
			case "대리":
				return timePay[1];
			case "과장":
				return timePay[2];
			case "차장":
				return timePay[3];
			case "부장":
				return timePay[4];
			case "비정규직":
				return tempUserPay;
			default:
				return 0;
		}
	}

	public double choicePay(String rank) { // 급여 리턴
		switch (rank) {
			case "비정규직":
				return payLevel[0];
			case "사원":
				return payLevel[1];
			case "대리":
				return payLevel[2];
			case "과장":
				return payLevel[3];
			case "차장":
				return payLevel[4];
			case "부장":
				return payLevel[5];
			default:
				return 0;
		}
	}

}
